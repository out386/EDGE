package com.edge.starringharsh.EDGE.model;

public class ContactsModel {
    private String name;
    private String phone;

    public ContactsModel(String name, String phone) {
        this.name = name.trim();
        this.phone = phone.trim();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj == this)
            return true;

        if (obj instanceof ContactsModel) {
            ContactsModel objModel = (ContactsModel) obj;
            return objModel.getName().equals(name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int a = 53;
        int result = 1;
        result = a * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
