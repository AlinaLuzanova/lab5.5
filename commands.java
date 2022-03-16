import java.util.Objects;

public class Commands {

    private CollectionManager manager;
    private String userCommand;
    private String[] finalUserCommand;

    {
        userCommand = "";
    }

    public Commander(CollectionManager manager) {
        this.manager = manager;
    }

    public void interactiveMod() throws IOException {
        try (Scanner commandReader = new Scanner(System.in)) {
            while (!userCommand.equals("exit")) {
                userCommand = commandReader.nextLine();
                finalUserCommand = userCommand.trim().split(" ", 2);
                try {

                    case "help":
                        manager.help();
                        break;

                    case "info":
                        System.out.println(manager.toString());
                        break;

                    case "show":
                        manager.show();
                        break;

                    case "add":
                        manager.add(finalUserCommand[1]);
                        break;

                    case "update id":
                        manager.update id (finalUserCommand[1]);
                        break;

                    case "remove_by_id":
                        manager.remove_by_id(finalUserCommand[1]);
                        break;

                    case "clear":
                        manager.clear();
                        break;

                    case "save":
                        manager.save();
                        break;

//execute_script file_name

                    case "exit":
                        manager.save();
                        break;

                    case "remove_first":
                        manager.remove_first();
                        break;

                    case "shuffle":
                        manager.shuffle();
                        break;

                    case "history":
                        manager.history();
                        break;

                    case "sum_of_annual_turnover":
                        manager.sum_of_annual_turnover();
                        break;

                    case "count_less_than_postal_addres":
                        manager.count_less_than_postal_addres();
                        break;

                    case "filter_by_employees_count":
                        manager.filter_by_employees_count();
                        break;

                    default:
                        System.out.println("Неопознанная команда. Наберите 'help' для справки.");
                }
            } catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Отсутствует аргумент.");
            }
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Commander)) return false;
            Commander commander = (Commander) o;
            return Objects.equals(manager, commander.manager);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(manager, userCommand);
            result = 31 * result + Arrays.hashCode(finalUserCommand);
            return result;
        }
    }
}
