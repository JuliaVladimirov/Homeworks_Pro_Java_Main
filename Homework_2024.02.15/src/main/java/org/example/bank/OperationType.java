package org.example.bank;

public enum OperationType {

    CONSULTATION ("consultation"),
    WITHDRAWAL ("withdrawal"),
    DEPOSIT ("deposit"),
    ACCOUNT_OPENING ("account opening"),
    COMMUNAL_FEES ("communal fees");

    OperationType() {
    }
    private String title;

    OperationType(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return  title;
    }
}

