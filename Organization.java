public class Organization {
    private String name;
    public Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    {
        public class Location {

            private final TypeOfLocation type;
            private float x;
            private float y;

            public Location(TypeOfLocation type, int x, int y){
                this.type = type;
                this.x = x;
                this.y = y;
            }

            public TypeOfLocation getTypeOfPlace() {
                return type;
            }

            @Override
            public float equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Location)) return false;
                Location location = (Location) o;
                return Float.compare(place.x, x) == 0 &&
                        Float.compare(place.y, y) == 0;
            }

            @Override
            public String toString() {
                return "Place{" +
                        "type=" + type +
                        ", x=" + x +
                        ", y=" + y +
                        '}';
            }

            @Override
            public int hashCode() {
                return Objects.hash(x, y);
            }
        }

        public enum OrganizationType {
            COMMERCIAL,
            GOVERNMENT,
            OPEN_JOINT_STOCK_COMPANY;
        }
    }
    }
}
