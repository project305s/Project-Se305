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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Main main0 = new Main();
        java.lang.Class<?> wildcardClass1 = main0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        UserData userData0 = new UserData();
        java.lang.Class<?> wildcardClass1 = userData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        RegistrationUI registrationUI0 = new RegistrationUI();
        java.lang.Class<?> wildcardClass1 = registrationUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.Class<?> wildcardClass1 = registrationService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.Class<?> wildcardClass9 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        java.lang.Class<?> wildcardClass6 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass11 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass7 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass9 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        java.lang.Class<?> wildcardClass5 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("hi!");
        java.lang.Class<?> wildcardClass3 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        java.lang.String str8 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        java.lang.String str20 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass6 = userData0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        java.lang.String str17 = userData0.getUser("");
        java.lang.String str19 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("");
        java.lang.String str20 = registrationService0.getUserDetails("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass3 = userData0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        java.lang.String str13 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str10 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass11 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("", "hi!", "");
        java.lang.Class<?> wildcardClass9 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("hi!", "", "");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("hi!", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("hi!");
        boolean boolean12 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        userData0.saveUser("", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        java.lang.String str6 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        UserData userData0 = new UserData();
        userData0.saveUser("", "hi!");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.String str12 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.Class<?> wildcardClass3 = registrationService0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("hi!");
        userData0.saveUser("", "");
        java.lang.String str9 = userData0.getUser("hi!");
        userData0.saveUser("", "hi!");
        userData0.saveUser("hi!", "Name: hi!, Email: hi!");
        userData0.saveUser("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        java.lang.String str16 = registrationService0.getUserDetails("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
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
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("Name: hi!, Email: hi!", "hi!", "");
        boolean boolean20 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
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
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("hi!");
        java.lang.Class<?> wildcardClass11 = userData0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        UserData userData0 = new UserData();
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("");
        userData0.saveUser("hi!", "");
        java.lang.String str9 = userData0.getUser("");
        java.lang.String str11 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("hi!");
        boolean boolean16 = registrationService0.registerUser("", "Name: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
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
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "hi!");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "hi!", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "Name: hi!, Email: hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        java.lang.String str12 = userData0.getUser("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        UserData userData0 = new UserData();
        java.lang.String str2 = userData0.getUser("hi!");
        java.lang.String str4 = userData0.getUser("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
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
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        UserData userData0 = new UserData();
        userData0.saveUser("", "");
        java.lang.String str5 = userData0.getUser("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        boolean boolean16 = registrationService0.registerUser("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        boolean boolean12 = registrationService0.registerUser("Name: hi!, Email: hi!", "", "Name: hi!, Email: hi!");
        java.lang.String str14 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        boolean boolean18 = registrationService0.registerUser("", "", "Name: hi!, Email: hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
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
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        userData0.saveUser("Name: hi!, Email: hi!", "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
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
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        boolean boolean6 = registrationService0.registerUser("", "hi!", "");
        java.lang.String str8 = registrationService0.getUserDetails("Name: hi!, Email: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        RegistrationService registrationService0 = new RegistrationService();
        java.lang.String str2 = registrationService0.getUserDetails("");
        java.lang.String str4 = registrationService0.getUserDetails("hi!");
        java.lang.String str6 = registrationService0.getUserDetails("hi!");
        boolean boolean10 = registrationService0.registerUser("hi!", "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        RegistrationService registrationService0 = new RegistrationService();
        boolean boolean4 = registrationService0.registerUser("", "", "hi!");
        boolean boolean8 = registrationService0.registerUser("hi!", "", "");
        java.lang.String str10 = registrationService0.getUserDetails("hi!");
        java.lang.String str12 = registrationService0.getUserDetails("");
        boolean boolean16 = registrationService0.registerUser("", "", "hi!");
        java.lang.String str18 = registrationService0.getUserDetails("hi!");
        boolean boolean22 = registrationService0.registerUser("", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        UserData userData0 = new UserData();
        userData0.saveUser("hi!", "");
        java.lang.String str5 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str10 = userData0.getUser("");
        userData0.saveUser("", "");
        java.lang.String str15 = userData0.getUser("");
        userData0.saveUser("Name: hi!, Email: hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}
