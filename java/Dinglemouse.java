import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dinglemouse {

	public static int deadAntCount(final String ants) {
		return ants == null ? 0 : (int) ants
				.replace("ant", "")
				.replaceAll("[^ant]", "")
				.chars()
				.boxed()
				.collect(
						Collectors.groupingBy(Function.identity(),
								Collectors.counting())).values().stream()
				.mapToLong(Long::longValue).max().orElse(0L);
	}

}