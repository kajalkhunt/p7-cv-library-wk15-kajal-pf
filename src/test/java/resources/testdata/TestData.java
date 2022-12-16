package resources.testdata;


import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][]data = new Object[][]{
                {"Tester","Harrow", "up to 5 miles","30000","500000","Per annum","Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Manager","Wembley", "up to 10 miles","40000","500000","Per annum","Permanent", "Permanent Manager jobs in Wembley"},
                {"Plumber","Watford", "up to 15 miles","50000","600000","Per annum","Permanent", "Permanent Plumber jobs in Watford"},
                {"Driver","Barnet", "up to 10 miles","60000","700000","Per annum","Permanent", "Permanent Driver jobs in Barnet"},
                {"Administrator","Ruislip", "up to 10 miles","70000","800000","Per annum","Permanent", "Permanent Administrator jobs in Ruislip"},
                {"Customer Assistant","Kilburn", "up to 7 miles","80000","900000","Per annum","Permanent", "Permanent Customer Assistant jobs in Kilburn"},
                {"Team Leader","Maida Vale", "up to 5 miles","90000","900000","Per annum","Permanent", "Permanent Team Leader jobs in Maida Vale"},

        };
        return data;
    }

}
