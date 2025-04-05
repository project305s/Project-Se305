import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Main main0 = new Main();
        java.lang.Class<?> wildcardClass1 = main0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        UserData userData0 = new UserData();
        java.lang.Class<?> wildcardClass1 = userData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        RegistrationUI registrationUI0 = new RegistrationUI();
        java.lang.Class<?> wildcardClass1 = registrationUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
// flaky "1) test004(RegressionTest0)":             registrationUI0.start();
// flaky "1) test004(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.util.InputMismatchException; message: null");
        } catch (java.util.InputMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass3 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.Class<?> wildcardClass9 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.Class<?> wildcardClass1 = registrationService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass7 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.Class<?> wildcardClass5 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass19 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass5 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass9 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.Class<?> wildcardClass6 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass21 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
        java.lang.Class<?> wildcardClass29 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Name: hi!, Email: hi!" + "'", str28, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean12 = registrationService0.registerUser("", "", "");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
        java.lang.Class<?> wildcardClass27 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
        java.lang.Class<?> wildcardClass25 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.Class<?> wildcardClass4 = userData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass7 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("", "hi!", "");
        java.lang.Class<?> wildcardClass9 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
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
        java.lang.Class<?> wildcardClass33 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.Class<?> wildcardClass7 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("");
        java.lang.Class<?> wildcardClass20 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "");
        java.lang.Class<?> wildcardClass9 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass3 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "", "");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass19 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("hi!");
        java.lang.String str4 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
        java.lang.Class<?> wildcardClass33 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.Class<?> wildcardClass4 = userData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("", "", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass9 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.Class<?> wildcardClass14 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass9 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        java.lang.Class<?> wildcardClass23 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass19 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass14 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass17 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Name: hi!, Email: hi!" + "'", str16, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass7 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("");
        java.lang.Class<?> wildcardClass12 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass10 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        java.lang.String str38 = registrationService0.getUserDetails("hi!");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Name: hi!, Email: hi!" + "'", str38, "Name: hi!, Email: hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass12 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass13 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str28 = registrationService0.getUserDetails("");
        boolean boolean32 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        java.lang.String str22 = registrationService0.getUserDetails("");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass9 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str17 = userData0.getUser("");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass16 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        java.lang.Class<?> wildcardClass27 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
        userData0.saveUser("", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.Class<?> wildcardClass12 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        java.lang.String str30 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean34 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
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
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        boolean boolean24 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        java.lang.Class<?> wildcardClass39 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        java.lang.Class<?> wildcardClass5 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean20 = registrationService0.registerUser("hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        boolean boolean12 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass19 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "");
        userData0.saveUser("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        java.lang.Class<?> wildcardClass22 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str24 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!" + "'", str24, "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass9 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        java.lang.Class<?> wildcardClass37 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        UserData userData0 = new UserData();
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = userData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        java.lang.String str18 = userData0.getUser("");
        java.lang.Class<?> wildcardClass19 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Name: hi!, Email: hi!" + "'", str16, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("", "", "");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("", "", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        java.lang.Class<?> wildcardClass33 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.Class<?> wildcardClass16 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("hi!");
        java.lang.String str19 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass16 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        boolean boolean32 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str17 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        boolean boolean26 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str28 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str6 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass12 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        java.lang.String str24 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass25 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: hi!, Email: hi!" + "'", str24, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass21 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        java.lang.String str30 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass31 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str13 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass14 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        java.lang.String str11 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        boolean boolean26 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str18 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("hi!", "hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str17 = userData0.getUser("");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Name: hi!, Email: hi!" + "'", str12, "Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Name: hi!, Email: hi!" + "'", str17, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str19 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str20 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str20 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass21 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        java.lang.String str13 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        java.lang.Class<?> wildcardClass25 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass12 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        java.lang.String str14 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        java.lang.Class<?> wildcardClass43 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
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
        java.lang.String str38 = registrationService0.getUserDetails("");
        java.lang.String str40 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean44 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        java.lang.String str32 = registrationService0.getUserDetails("hi!");
        boolean boolean36 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Name: hi!, Email: hi!" + "'", str32, "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        boolean boolean36 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        boolean boolean34 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str36 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean20 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("hi!", "");
        java.lang.String str20 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass20 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
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
        java.lang.String str40 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!" + "'", str40, "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass21 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass23 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str28 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        java.lang.Class<?> wildcardClass41 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        java.lang.String str12 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass13 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean24 = registrationService0.registerUser("", "hi!", "hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!", "");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        java.lang.String str28 = registrationService0.getUserDetails("");
        boolean boolean32 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
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
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Name: hi!, Email: hi!" + "'", str10, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "hi!");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str19 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("");
        java.lang.String str23 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        java.lang.Class<?> wildcardClass39 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean28 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        java.lang.String str14 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass27 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass27 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str24, "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        boolean boolean42 = registrationService0.registerUser("", "hi!", "");
        boolean boolean46 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean50 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        java.lang.String str38 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str40 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
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
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str20 = userData0.getUser("hi!");
        java.lang.String str22 = userData0.getUser("");
        java.lang.Class<?> wildcardClass23 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean10 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "", "");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean26 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass27 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str13 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str18 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str18, "Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        java.lang.Class<?> wildcardClass29 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean10 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass19 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        boolean boolean46 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        java.lang.String str14 = userData0.getUser("");
        java.lang.String str16 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Name: hi!, Email: hi!" + "'", str12, "Name: hi!, Email: hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        boolean boolean42 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean46 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
        boolean boolean36 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str16 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        java.lang.Class<?> wildcardClass27 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
        java.lang.String str30 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
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
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("", "hi!");
        java.lang.String str19 = userData0.getUser("");
        java.lang.String str21 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("", "hi!", "");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        java.lang.Class<?> wildcardClass27 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str23 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str10 = userData0.getUser("");
        java.lang.String str12 = userData0.getUser("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass6 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        java.lang.String str28 = registrationService0.getUserDetails("");
        java.lang.String str30 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
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
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass12 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        java.lang.Class<?> wildcardClass6 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("hi!");
        java.lang.String str9 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass10 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        java.lang.Class<?> wildcardClass12 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("");
        java.lang.Class<?> wildcardClass3 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        userData0.saveUser("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        java.lang.String str6 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass16 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
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
        java.lang.String str30 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
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
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        java.lang.Class<?> wildcardClass5 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
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
        java.lang.Class<?> wildcardClass31 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("");
        java.lang.String str16 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "hi!", "hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass21 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str19 = userData0.getUser("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "hi!");
        boolean boolean28 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
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
        java.lang.String str34 = registrationService0.getUserDetails("");
        boolean boolean38 = registrationService0.registerUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("");
        java.lang.String str9 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean28 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
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
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass21 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str15 = userData0.getUser("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean24 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean28 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        java.lang.String str30 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Name: hi!, Email: hi!" + "'", str12, "Name: hi!, Email: hi!");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass25 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!" + "'", str24, "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        userData0.saveUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str20 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        java.lang.String str11 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str13 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str17 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean28 = registrationService0.registerUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        boolean boolean38 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        boolean boolean10 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "");
        boolean boolean22 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        boolean boolean24 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "");
        boolean boolean28 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        java.lang.String str38 = registrationService0.getUserDetails("");
        boolean boolean42 = registrationService0.registerUser("", "hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass5 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str23 = userData0.getUser("hi!");
        java.lang.String str25 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!" + "'", str25, "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        boolean boolean34 = registrationService0.registerUser("hi!", "", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        java.lang.Class<?> wildcardClass31 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        userData0.saveUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        java.lang.String str11 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str13 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass19 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        java.lang.String str6 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str8 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str10 = userData0.getUser("");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str28 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str30 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Name: hi!, Email: Name: hi!, Email: hi!" + "'", str30, "Name: hi!, Email: Name: hi!, Email: hi!");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
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
        boolean boolean34 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass35 = registrationService0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("", "");
        java.lang.String str23 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean16 = registrationService0.registerUser("hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str13 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass14 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str23 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        java.lang.String str42 = registrationService0.getUserDetails("");
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
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass17 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!");
        boolean boolean18 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        boolean boolean24 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        boolean boolean28 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        boolean boolean30 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        java.lang.String str38 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
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
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str8 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("");
        java.lang.String str16 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        boolean boolean20 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean26 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        boolean boolean30 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        java.lang.String str28 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass29 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean14 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.String str16 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("hi!");
        java.lang.String str21 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str23 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str25 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: hi!, Email: Name: hi!, Email: hi!");
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
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass19 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        boolean boolean14 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str20 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass21 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str24 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str18 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean12 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str28 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass19 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str12 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        java.lang.String str25 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass13 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        java.lang.String str12 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass23 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass21 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str28 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str30 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass17 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        boolean boolean26 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        boolean boolean30 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        boolean boolean28 = registrationService0.registerUser("hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        boolean boolean32 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
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
        java.lang.Class<?> wildcardClass27 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str14 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        java.lang.String str32 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!" + "'", str32, "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str23 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass24 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Name: Name: hi!, Email: hi!, Email: hi!" + "'", str23, "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str14 = userData0.getUser("hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass7 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
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
        java.lang.String str38 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
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
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass8 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        java.lang.Class<?> wildcardClass24 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str20 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str7 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str19 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        java.lang.String str18 = registrationService0.getUserDetails("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass10 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
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
        boolean boolean32 = registrationService0.registerUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("hi!");
        java.lang.String str9 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str20 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass24 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass20 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "");
        java.lang.String str16 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        java.lang.String str18 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        java.lang.String str14 = registrationService0.getUserDetails("");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        java.lang.String str20 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str25 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str27 = userData0.getUser("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!" + "'", str7, "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        boolean boolean36 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
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
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "hi!", "");
        boolean boolean22 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        java.lang.String str6 = userData0.getUser("hi!");
        java.lang.String str8 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("");
        java.lang.String str21 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
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
        java.lang.String str25 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        java.lang.String str22 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass21 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        java.lang.Class<?> wildcardClass33 = registrationService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass15 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        java.lang.String str15 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str8 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str26 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        java.lang.String str7 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass13 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
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
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "");
        java.lang.String str14 = registrationService0.getUserDetails("");
        boolean boolean18 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str20 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("", "hi!");
        java.lang.String str17 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str19 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        UserData userData0 = new UserData();
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str5 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "hi!");
        java.lang.Class<?> wildcardClass9 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        boolean boolean22 = registrationService0.registerUser("", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str24 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str17 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        userData0.saveUser("", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("hi!");
        java.lang.String str11 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        java.lang.String str16 = userData0.getUser("hi!");
        java.lang.String str18 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Name: hi!, Email: hi!" + "'", str16, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        boolean boolean34 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        boolean boolean38 = registrationService0.registerUser("", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str22 = registrationService0.getUserDetails("hi!");
        boolean boolean26 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "Name: hi!, Email: hi!");
        java.lang.String str28 = registrationService0.getUserDetails("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        java.lang.String str30 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Name: hi!, Email: Name: hi!, Email: hi!" + "'", str30, "Name: hi!, Email: Name: hi!, Email: hi!");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str16 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
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
        java.lang.String str29 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
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
        boolean boolean42 = registrationService0.registerUser("", "hi!", "");
        boolean boolean46 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str48 = registrationService0.getUserDetails("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str50 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean54 = registrationService0.registerUser("Name: hi!, Email: Name: hi!, Email: hi!", "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: hi!");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str10 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass6 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("hi!", "hi!", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        userData0.saveUser("hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        boolean boolean16 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
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
        java.lang.String str24 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!" + "'", str22, "Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("");
        boolean boolean18 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str8 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str11 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        java.lang.String str14 = userData0.getUser("");
        java.lang.String str16 = userData0.getUser("hi!");
        java.lang.String str18 = userData0.getUser("Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        java.lang.String str8 = userData0.getUser("hi!");
        java.lang.String str10 = userData0.getUser("");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        java.lang.String str19 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str21 = userData0.getUser("hi!");
        java.lang.String str23 = userData0.getUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        boolean boolean20 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: Name: hi!, Email: hi!, Email: hi!");
        boolean boolean24 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("Name: Name: hi!, Email: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        userData0.saveUser("", "Name: hi!, Email: hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        java.lang.Class<?> wildcardClass18 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: hi!, Email: hi!" + "'", str14, "Name: hi!, Email: hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        java.lang.Class<?> wildcardClass29 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.String str7 = userData0.getUser("Name: hi!, Email: hi!");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        java.lang.String str14 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        java.lang.String str19 = userData0.getUser("");
        java.lang.String str21 = userData0.getUser("Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!");
        userData0.saveUser("Name: Name: Name: hi!, Email: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
        java.lang.String str28 = registrationService0.getUserDetails("");
        boolean boolean32 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        boolean boolean36 = registrationService0.registerUser("Name: Name: hi!, Email: hi!, Email: hi!", "Name: hi!, Email: Name: Name: hi!, Email: hi!, Email: hi!", "");
        boolean boolean40 = registrationService0.registerUser("hi!", "Name: Name: hi!, Email: hi!, Email: Name: hi!, Email: hi!", "Name: hi!, Email: Name: hi!, Email: hi!");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }
}
