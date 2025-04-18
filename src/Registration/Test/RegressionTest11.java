import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str23 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        boolean boolean12 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str19 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str19, "Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str34 = registrationService0.getUserDetails("");
        boolean boolean38 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        boolean boolean42 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean46 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("", "hi!", "hi!");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("hi!", "hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str17 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass24 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("hi!", "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean12 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str34 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str36 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str38 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Name: hi!, Email: hi!" + "'", str38, "Name: hi!, Email: hi!");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("");
        java.lang.String str9 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        java.lang.String str12 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        boolean boolean30 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str32 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean36 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str38 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        boolean boolean12 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str19 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Name: hi!, Email: hi!" + "'", str12, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Name: hi!, Email: hi!" + "'", str19, "Name: hi!, Email: hi!");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str15 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        java.lang.String str30 = registrationService0.getUserDetails("");
        boolean boolean34 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass19 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        boolean boolean30 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str32 = registrationService0.getUserDetails("");
        java.lang.String str34 = registrationService0.getUserDetails("hi!");
        boolean boolean38 = registrationService0.registerUser("", "hi!", "hi!");
        java.lang.String str40 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str42 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean46 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Name: hi!, Email: hi!" + "'", str34, "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str34 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass35 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str26 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str28 = userData0.getUser("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Name: hi!, Email: hi!" + "'", str28, "Name: hi!, Email: hi!");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean12 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str24 = registrationService0.getUserDetails("");
        java.lang.String str26 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        java.lang.String str14 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean30 = registrationService0.registerUser("", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str32 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str15 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("");
        java.lang.String str21 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "hi!");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean36 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("hi!", "");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass7 = userData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str18 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str22 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass23 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str34 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean38 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass39 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        boolean boolean30 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str32 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean36 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        boolean boolean40 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str13 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str19 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        boolean boolean36 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str38 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str40 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean44 = registrationService0.registerUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean48 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Name: hi!, Email: hi!" + "'", str28, "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "", "");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str18, "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        boolean boolean12 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        java.lang.String str13 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str15 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean30 = registrationService0.registerUser("", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str32 = registrationService0.getUserDetails("");
        java.lang.String str34 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean28 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        boolean boolean32 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean10 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        boolean boolean22 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str19 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str23 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "");
        boolean boolean20 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: hi!, Email: hi!" + "'", str14, "Name: hi!, Email: hi!");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str12 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str13 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass14 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str26 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass27 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Name: hi!, Email: hi!" + "'", str26, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass10 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!" + "'", str22, "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str34 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass35 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Name: hi!, Email: hi!" + "'", str28, "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean24 = registrationService0.registerUser("", "", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str6 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!" + "'", str14, "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        boolean boolean30 = registrationService0.registerUser("", "Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str20 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("hi!", "", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean20 = registrationService0.registerUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass25 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("");
        boolean boolean12 = registrationService0.registerUser("hi!", "hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        boolean boolean26 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        boolean boolean30 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str32 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("");
        java.lang.String str14 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Name: hi!, Email: hi!" + "'", str12, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str13 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str15 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!" + "'", str15, "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        boolean boolean30 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str32 = registrationService0.getUserDetails("");
        java.lang.String str34 = registrationService0.getUserDetails("hi!");
        boolean boolean38 = registrationService0.registerUser("", "hi!", "hi!");
        java.lang.String str40 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str42 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean46 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Name: hi!, Email: hi!" + "'", str34, "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean20 = registrationService0.registerUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        boolean boolean28 = registrationService0.registerUser("", "", "");
        java.lang.String str30 = registrationService0.getUserDetails("Name: hi!, Email: Name: hi!, Email: hi!");
        boolean boolean34 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str20 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        java.lang.String str14 = registrationService0.getUserDetails("");
        java.lang.String str16 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean20 = registrationService0.registerUser("hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass21 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str23 = userData0.getUser("hi!");
        java.lang.String str25 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("");
        java.lang.String str18 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Name: hi!, Email: hi!" + "'", str16, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        java.lang.String str6 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str8 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str13 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str34 = registrationService0.getUserDetails("");
        boolean boolean38 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        boolean boolean42 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean46 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "", "");
        boolean boolean28 = registrationService0.registerUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        boolean boolean30 = registrationService0.registerUser("hi!", "hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean34 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        boolean boolean38 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str24, "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str26, "Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("");
        java.lang.String str23 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str28 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str30 = userData0.getUser("");
        java.lang.String str32 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean20 = registrationService0.registerUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        boolean boolean28 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str22 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean30 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str22 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        java.lang.String str14 = userData0.getUser("");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: hi!, Email: hi!" + "'", str14, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("hi!");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str16 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.String str24 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("");
        java.lang.String str14 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "");
        boolean boolean28 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean32 = registrationService0.registerUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean26 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        boolean boolean30 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        boolean boolean34 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        boolean boolean30 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str32 = registrationService0.getUserDetails("");
        boolean boolean36 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str17 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str25 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str25, "Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean28 = registrationService0.registerUser("hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str30 = registrationService0.getUserDetails("");
        boolean boolean34 = registrationService0.registerUser("hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean38 = registrationService0.registerUser("hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("hi!", "hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!" + "'", str16, "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("");
        java.lang.String str9 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass16 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean28 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str23 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str17 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str22 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str20 = registrationService0.getUserDetails("");
        boolean boolean24 = registrationService0.registerUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        java.lang.String str14 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        boolean boolean30 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str32 = registrationService0.getUserDetails("");
        boolean boolean36 = registrationService0.registerUser("", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean40 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean44 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean48 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean52 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Name: hi!, Email: hi!" + "'", str17, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        java.lang.String str14 = userData0.getUser("");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str24 = registrationService0.getUserDetails("hi!");
        java.lang.String str26 = registrationService0.getUserDetails("");
        boolean boolean30 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        boolean boolean34 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: hi!, Email: hi!" + "'", str24, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!" + "'", str22, "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        java.lang.String str22 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "", "");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str18, "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str24, "Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str28 = registrationService0.getUserDetails("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        boolean boolean18 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean28 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str30 = registrationService0.getUserDetails("");
        java.lang.String str32 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean36 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "", "");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass19 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str18, "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean28 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str30 = registrationService0.getUserDetails("");
        boolean boolean34 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str36 = registrationService0.getUserDetails("");
        java.lang.String str38 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str40 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str42 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str38, "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "");
        boolean boolean20 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str15 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "", "");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str18, "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "hi!", "");
        boolean boolean22 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str24 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str6 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str16, "Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        boolean boolean20 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("hi!");
        java.lang.String str17 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        boolean boolean30 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str32 = registrationService0.getUserDetails("");
        java.lang.String str34 = registrationService0.getUserDetails("hi!");
        boolean boolean38 = registrationService0.registerUser("", "hi!", "hi!");
        java.lang.String str40 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str42 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass43 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Name: hi!, Email: hi!" + "'", str34, "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass16 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("hi!");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str24 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass25 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "");
        java.lang.String str18 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!" + "'", str18, "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("hi!", "Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass24 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass6 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str24 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str32 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("", "hi!");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str28 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "", "");
        boolean boolean16 = registrationService0.registerUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        java.lang.String str18 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Name: hi!, Email: hi!" + "'", str16, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("hi!");
        boolean boolean28 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        boolean boolean12 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "hi!");
        java.lang.String str14 = registrationService0.getUserDetails("");
        java.lang.String str16 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str24 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str29 = userData0.getUser("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("");
        java.lang.String str23 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str28 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str30 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean12 = registrationService0.registerUser("", "", "");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        boolean boolean20 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean30 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str32 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str20 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass5 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("hi!");
        java.lang.String str23 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str23 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str25 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        java.lang.String str14 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        java.lang.String str28 = registrationService0.getUserDetails("hi!");
        boolean boolean32 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str34 = registrationService0.getUserDetails("");
        boolean boolean38 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        boolean boolean42 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        boolean boolean46 = registrationService0.registerUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean12 = registrationService0.registerUser("", "", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

