package Data;

public enum OrganizationType {
    COMMERCIAL,
    GOVERNMENT,
    OPEN_JOINT_STOCK_COMPANY;
    static OrganizationType[] nameOrganizationType = OrganizationType.values();

    public static void outputOrganizationType() {
        for (OrganizationType element: nameOrganizationType) {
            System.out.print(element + " ");
        }
        System.out.print(": ");
    }

}

