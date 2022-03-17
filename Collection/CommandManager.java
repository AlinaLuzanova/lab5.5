package Collection;
import Commands.Commands;
public class CommandManager {
    private static Commands info;
    private static Commands show;
    private static Commands add;
    private static Commands update_id;
    private static Commands remove_by_id;
    private static Commands clear;
    private static Commands save;
    private static Commands execute_script;
    private static Commands exit;
    private static Commands remove_first;
    private static Commands shuffle;
    private static Commands history;
    private static Commands count_less_than_postal_address;
    private static Commands filter_by_employees_count;



    public CommandManager(Commands info,
                          Commands show,
                          Commands add,
                          Commands update_id,
                          Commands remove_by_id,
                          Commands clear,
                          Commands save,
                          Commands execute_script,
                          Commands exit,
                          Commands remove_first,
                          Commands shuffle,
                          Commands history,
                          Commands count_less_than_postal_address,
                          Commands filter_by_employees_count)
    {
        this.info = info;
        this.show = show;
        this.add = add;
        this.update_id = update_id;
        this.remove_by_id = remove_by_id;
        this.clear = clear;
        this.save = save;
        this.execute_script = execute_script;
        this.exit = exit;
        this.remove_first = remove_first;
        this.shuffle = shuffle;
        this.history = history;
        this.count_less_than_postal_address = count_less_than_postal_address;
        this.filter_by_employees_count = filter_by_employees_count;

    }

    public static boolean info() {
        return info.execute_script();
    }

    public static boolean show() {
        return show.execute_script();
    }

    public static boolean add() {
        return add.execute_script();
    }

    public static boolean update_id(String s) {
        return update_id.execute_script(s);
    }

    public static boolean remove_by_id(String s) {
        return remove_by_id.execute_script(s);
    }

    public static boolean clear() {
        return clear.execute_script();
    }

    public static boolean save() {
        return save.execute_script();
    }


    public static boolean execute_script() {
        return save.execute_script();
    }

    public static boolean exit() {
        return exit.execute_script();
    }


    public static boolean remove_first(String s) {
        return remove_first.execute(s);
    }

    public static boolean shuffle() {
        return shuffle.execute_script();
    }

    public static boolean history() {
        return history.execute_script();
    }


    public static boolean sum_of_annual_turnover() {
        return sum_of_annual_turnover.execute_script();
    }


    public static boolean sum_of_annual_turnover() {
        return sum_of_annual_turnover.execute_script();
    }


    public static boolean sum_of_annual_turnover() {
        return sum_of_annual_turnover.execute_script();
    }

}
