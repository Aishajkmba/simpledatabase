public class Database {
    private String filename;
    private int rowWidth;
    private int recordCount;

    public Database(String filename, int rowWidth) {
        this.filename = filename;
        this.rowWidth = rowWidth;
        recordCount = FileHandler.countLines(filename);
        //TODO don't count deleted records

    }

    // add a new record to the end of the database
    public void appendRecord(String data) {
        // TODO: Pad the data to the correct record width
        //compare length of data to add with the row width
        //if less add enough spaces to match row width
        //if more truncate to exactly width


            // TODO: Report an error if the data is too long for the record
            FileHandler.appendLine(filename, data);
            recordCount++;
        }
    
    // delete the record at the specified row
    public void deleteRecord(int rowNumber) {

        // TODO: replace this placeholder code
        recordCount--;
    }

    // return the record at the specified row
    public String getRecord(int rowNumber) {
        //TODO if the line is marked as deleted try the next one
        return ""; // TODO: replace this placeholder code
    }

    // return the number of records in the database
    public int getRecordCount(int rowNumber) {
        return recordCount;
    }

    // search for a record matching data
    // return true if found
    public boolean findRecord(String data) {
        return false; // TODO: replace this placeholder code
    }

    

}
