import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int i : source) {
            if (i < this.treshold) {
                logger.log("Элемент \"" + i + "\" не проходит");
            } else {
                result.add(i);
                logger.log("Элемент \"" + i + "\" проходит");
            }
        }
        String e;
        if (result.size() == 1) {
            e = " элемент ";
        } else if (result.size() >= 2 && result.size() <= 4) {
            e = " элемента ";
        } else {
            e = " элементов ";
        }
        logger.log("Прошло фильтр " + result.size() + e + "из " + source.size());
        return result;
    }
}