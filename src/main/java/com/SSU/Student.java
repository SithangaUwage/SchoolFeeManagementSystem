package com.SSU;

public class Student {

        private int id;
        private String name;
        private int year;
        private int feesPaid;
        private int feesTotal;

    /**
     * To create a new student by initilizing.
     * Fees for every student is £9,000 per year.
     * Fees paid initially is £0.
     * @param id - id for the student: unique identifier.
     * @param name - name of the student.
     * @param year - year of the student.
     */
    public Student(int id, String name, int year){
        // creating a new student object
        feesPaid = 0;
        feesTotal = 9000;
        this.id = id;
        this.name = name;
        this.year = year;

        }

    // Not going to alter student's id and name.

    /**
     * Used to update student's year.
     * @param year - new year of the student.
     */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * Keep adding the fees to fees paid field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees - the fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return year of the student (class)
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+ name + " -> Total fees paid so far £" + feesPaid;
    }
}
