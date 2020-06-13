import java.util.ArrayList;
import java.util.List;

public class SILab2
{
		public List<String> function(List<String> list)
		{
			if (list.size() <= 0) // 1
				throw new IllegalArgumentException("List length should be greater than 0"); // 2

			List<String> numMines = new ArrayList<>();
			//        3        4              11
			for (int i = 0; i < list.size(); i++)
			{
				if (!list.get(i).equals("#")) // 5
				{
					int num = 0;

					if (i - 1 >= 0 && list.get(i - 1).equals("#")) // 6
						num++; // 7
					if (i + 1 < list.size() && list.get(i + 1).equals("#")) // 8
						num++; // 9

					numMines.add(String.valueOf(num)); // 10
				}  else
					numMines.add(list.get(i)); // 12
			}
			return numMines; // 13
		}
}
