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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        DataLayer dataLayer0 = null;
        BusinessLayer businessLayer1 = new BusinessLayer(dataLayer0);
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            businessLayer1.processPayment(payment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DataLayer.savePayment(Payment)\" because \"this.DataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        DataLayer dataLayer0 = null;
        BusinessLayer businessLayer1 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            Payment payment3 = businessLayer1.getPaymentDetails("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DataLayer.getPaymentById(String)\" because \"this.DataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        DataLayer dataLayer0 = null;
        BusinessLayer businessLayer1 = new BusinessLayer(dataLayer0);
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        // The following exception was thrown during execution in test generation
        try {
            businessLayer1.processPayment(payment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DataLayer.savePayment(Payment)\" because \"this.DataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        DataLayer dataLayer0 = null;
        BusinessLayer businessLayer1 = new BusinessLayer(dataLayer0);
        Payment payment6 = new Payment("", "hi!", 0.0d, "");
        // The following exception was thrown during execution in test generation
        try {
            businessLayer1.processPayment(payment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DataLayer.savePayment(Payment)\" because \"this.DataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Payment payment4 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str5 = payment4.getDescription();
        java.lang.String str6 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str6, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        PresentationLayer presentationLayer0 = new PresentationLayer();
        presentationLayer0.start();
        java.lang.Class<?> wildcardClass2 = presentationLayer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.toString();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Payment payment4 = new Payment("", "hi!", 0.0d, "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        DataLayer dataLayer0 = null;
        BusinessLayer businessLayer1 = new BusinessLayer(dataLayer0);
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        double double8 = payment6.getAmount();
        java.lang.String str9 = payment6.toString();
        // The following exception was thrown during execution in test generation
        try {
            businessLayer1.processPayment(payment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DataLayer.savePayment(Payment)\" because \"this.DataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str9, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.Class<?> wildcardClass12 = dataLayer0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass3 = businessLayer2.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        java.lang.Class<?> wildcardClass13 = businessLayer2.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment17 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(payment17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer16);
        Payment payment20 = businessLayer18.getPaymentDetails("");
        java.util.List<Payment> paymentList21 = businessLayer18.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer18.getAllPayments();
        Payment payment27 = new Payment("", "hi!", 0.0d, "");
        businessLayer18.processPayment(payment27);
        java.lang.String str29 = payment27.getDescription();
        businessLayer15.processPayment(payment27);
        java.lang.String str31 = payment27.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.getUserId();
        java.lang.String str8 = payment4.getTransactionId();
        java.lang.String str9 = payment4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        java.lang.String str13 = payment11.getTransactionId();
        java.lang.Class<?> wildcardClass14 = payment11.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Payment payment4 = new Payment("", "", (double) 10, "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        double double10 = payment6.getAmount();
        java.lang.Class<?> wildcardClass11 = payment6.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) ' ', "hi!");
        java.lang.String str5 = payment4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str5, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", 1.0d, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        Payment payment6 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNull(payment6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        java.util.List<Payment> paymentList42 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentList42);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.toString();
        double double7 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", 32.0d, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str5, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        DataLayer dataLayer9 = new DataLayer();
        java.util.List<Payment> paymentList10 = dataLayer9.getAllPayments();
        Payment payment15 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str16 = payment15.getUserId();
        java.lang.String str17 = payment15.toString();
        boolean boolean18 = dataLayer9.savePayment(payment15);
        java.lang.String str19 = payment15.getDescription();
        boolean boolean20 = dataLayer0.savePayment(payment15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        java.lang.String str15 = payment10.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str15, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        DataLayer dataLayer0 = null;
        BusinessLayer businessLayer1 = new BusinessLayer(dataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<Payment> paymentList2 = businessLayer1.getAllPayments();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DataLayer.getAllPayments()\" because \"this.DataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        java.lang.String str13 = payment11.getDescription();
        java.lang.String str14 = payment11.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getDescription();
        java.lang.String str6 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str5, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str6, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList12 = businessLayer11.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        double double10 = payment6.getAmount();
        java.lang.String str11 = payment6.toString();
        java.lang.String str12 = payment6.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        double double15 = payment10.getAmount();
        java.lang.String str16 = payment10.getDescription();
        java.lang.String str17 = payment10.getUserId();
        java.lang.String str18 = payment10.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList47 = businessLayer46.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertNotNull(paymentList47);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        DataLayer dataLayer17 = new DataLayer();
        java.util.List<Payment> paymentList18 = dataLayer17.getAllPayments();
        BusinessLayer businessLayer19 = new BusinessLayer(dataLayer17);
        Payment payment21 = businessLayer19.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList22 = businessLayer19.getAllPayments();
        Payment payment27 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str28 = payment27.getUserId();
        double double29 = payment27.getAmount();
        java.lang.String str30 = payment27.toString();
        businessLayer19.processPayment(payment27);
        businessLayer2.processPayment(payment27);
        java.lang.String str33 = payment27.getUserId();
        java.lang.String str34 = payment27.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertNull(payment21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str30, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str34, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Payment payment4 = new Payment("", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", 0.0d, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer44 = new DataLayer();
        java.util.List<Payment> paymentList45 = dataLayer44.getAllPayments();
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer44);
        Payment payment48 = businessLayer46.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList49 = businessLayer46.getAllPayments();
        Payment payment54 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str55 = payment54.getUserId();
        double double56 = payment54.getAmount();
        java.lang.String str57 = payment54.toString();
        businessLayer46.processPayment(payment54);
        double double59 = payment54.getAmount();
        boolean boolean60 = dataLayer0.savePayment(payment54);
        java.lang.String str61 = payment54.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertNull(payment48);
        org.junit.Assert.assertNotNull(paymentList49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        Payment payment17 = businessLayer2.getPaymentDetails("");
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        Payment payment24 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str25 = payment24.getUserId();
        java.lang.String str26 = payment24.toString();
        boolean boolean27 = dataLayer18.savePayment(payment24);
        DataLayer dataLayer28 = new DataLayer();
        java.util.List<Payment> paymentList29 = dataLayer28.getAllPayments();
        BusinessLayer businessLayer30 = new BusinessLayer(dataLayer28);
        Payment payment32 = businessLayer30.getPaymentDetails("");
        java.util.List<Payment> paymentList33 = businessLayer30.getAllPayments();
        java.util.List<Payment> paymentList34 = businessLayer30.getAllPayments();
        Payment payment39 = new Payment("", "hi!", 0.0d, "");
        businessLayer30.processPayment(payment39);
        boolean boolean41 = dataLayer18.savePayment(payment39);
        DataLayer dataLayer42 = new DataLayer();
        Payment payment47 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str48 = payment47.getUserId();
        java.lang.String str49 = payment47.toString();
        boolean boolean50 = dataLayer42.savePayment(payment47);
        Payment payment52 = dataLayer42.getPaymentById("");
        java.lang.String str53 = payment52.getTransactionId();
        boolean boolean54 = dataLayer18.savePayment(payment52);
        businessLayer2.processPayment(payment52);
        Payment payment57 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(payment17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str26, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentList29);
        org.junit.Assert.assertNull(payment32);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str49, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(payment52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(payment57);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        Payment payment18 = dataLayer0.getPaymentById("");
        java.util.List<Payment> paymentList19 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Payment payment4 = new Payment("", "hi!", (double) 10, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.getDescription();
        java.lang.String str7 = payment4.getTransactionId();
        double double8 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str5, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList4 = businessLayer3.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("");
        DataLayer dataLayer12 = new DataLayer();
        java.util.List<Payment> paymentList13 = dataLayer12.getAllPayments();
        Payment payment18 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str19 = payment18.getUserId();
        java.lang.String str20 = payment18.toString();
        boolean boolean21 = dataLayer12.savePayment(payment18);
        BusinessLayer businessLayer22 = new BusinessLayer(dataLayer12);
        Payment payment24 = businessLayer22.getPaymentDetails("");
        boolean boolean25 = dataLayer0.savePayment(payment24);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(payment11);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(payment24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        DataLayer dataLayer6 = new DataLayer();
        Payment payment11 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str12 = payment11.getUserId();
        java.lang.String str13 = payment11.toString();
        boolean boolean14 = dataLayer6.savePayment(payment11);
        Payment payment16 = dataLayer6.getPaymentById("");
        java.lang.String str17 = payment16.getDescription();
        businessLayer2.processPayment(payment16);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(payment16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.lang.String str11 = payment8.toString();
        java.lang.String str12 = payment8.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str11, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        double double8 = payment4.getAmount();
        java.lang.String str9 = payment4.getDescription();
        java.lang.String str10 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Payment payment4 = new Payment("hi!", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) 100L, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.lang.String str5 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str5, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer16);
        Payment payment20 = businessLayer18.getPaymentDetails("");
        java.util.List<Payment> paymentList21 = businessLayer18.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer18.getAllPayments();
        Payment payment27 = new Payment("", "hi!", 0.0d, "");
        businessLayer18.processPayment(payment27);
        java.lang.String str29 = payment27.getDescription();
        businessLayer15.processPayment(payment27);
        java.lang.String str31 = payment27.getUserId();
        java.lang.String str32 = payment27.toString();
        java.lang.String str33 = payment27.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str32, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 100.0f, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList12 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer13 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList14 = businessLayer13.getAllPayments();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(paymentList14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment19 = businessLayer2.getPaymentDetails("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.toString();
        java.lang.String str9 = payment4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment14 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNull(payment14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        DataLayer dataLayer11 = new DataLayer();
        Payment payment16 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str17 = payment16.getUserId();
        java.lang.String str18 = payment16.toString();
        boolean boolean19 = dataLayer11.savePayment(payment16);
        Payment payment24 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str25 = payment24.getDescription();
        java.lang.String str26 = payment24.getTransactionId();
        boolean boolean27 = dataLayer11.savePayment(payment24);
        java.lang.String str28 = payment24.getUserId();
        boolean boolean29 = dataLayer0.savePayment(payment24);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment17 = businessLayer15.getPaymentDetails("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList18 = businessLayer15.getAllPayments();
        java.lang.Class<?> wildcardClass19 = paymentList18.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        java.lang.String str10 = payment6.getTransactionId();
        java.lang.String str11 = payment6.getDescription();
        double double12 = payment6.getAmount();
        java.lang.Class<?> wildcardClass13 = payment6.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        Payment payment19 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str20 = payment19.getUserId();
        boolean boolean21 = dataLayer0.savePayment(payment19);
        java.lang.String str22 = payment19.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        Payment payment17 = businessLayer2.getPaymentDetails("");
        java.lang.String str18 = payment17.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(payment17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        java.lang.Class<?> wildcardClass28 = payment21.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        DataLayer dataLayer5 = new DataLayer();
        java.util.List<Payment> paymentList6 = dataLayer5.getAllPayments();
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer5);
        Payment payment9 = businessLayer7.getPaymentDetails("");
        java.util.List<Payment> paymentList10 = businessLayer7.getAllPayments();
        java.util.List<Payment> paymentList11 = businessLayer7.getAllPayments();
        Payment payment16 = new Payment("", "hi!", 0.0d, "");
        businessLayer7.processPayment(payment16);
        Payment payment19 = businessLayer7.getPaymentDetails("");
        java.lang.String str20 = payment19.getUserId();
        businessLayer2.processPayment(payment19);
        java.lang.String str22 = payment19.getUserId();
        double double23 = payment19.getAmount();
        java.lang.Class<?> wildcardClass24 = payment19.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(payment19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        Payment payment6 = businessLayer2.getPaymentDetails("hi!");
        Payment payment8 = businessLayer2.getPaymentDetails("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNull(payment8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        double double14 = payment10.getAmount();
        java.lang.String str15 = payment10.getDescription();
        businessLayer5.processPayment(payment10);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer2.processPayment(payment22);
        java.lang.String str24 = payment22.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str24, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Payment payment4 = new Payment("hi!", "", (double) ' ', "");
        java.lang.String str5 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        java.util.List<Payment> paymentList6 = dataLayer4.getAllPayments();
        Payment payment8 = dataLayer4.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer9 = new DataLayer();
        Payment payment14 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str15 = payment14.getUserId();
        java.lang.String str16 = payment14.toString();
        boolean boolean17 = dataLayer9.savePayment(payment14);
        boolean boolean18 = dataLayer4.savePayment(payment14);
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        Payment payment25 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str26 = payment25.getUserId();
        java.lang.String str27 = payment25.toString();
        boolean boolean28 = dataLayer19.savePayment(payment25);
        double double29 = payment25.getAmount();
        java.lang.String str30 = payment25.getUserId();
        boolean boolean31 = dataLayer4.savePayment(payment25);
        java.lang.String str32 = payment25.getTransactionId();
        boolean boolean33 = dataLayer0.savePayment(payment25);
        DataLayer dataLayer34 = new DataLayer();
        java.util.List<Payment> paymentList35 = dataLayer34.getAllPayments();
        BusinessLayer businessLayer36 = new BusinessLayer(dataLayer34);
        Payment payment38 = businessLayer36.getPaymentDetails("hi!");
        DataLayer dataLayer39 = new DataLayer();
        java.util.List<Payment> paymentList40 = dataLayer39.getAllPayments();
        BusinessLayer businessLayer41 = new BusinessLayer(dataLayer39);
        DataLayer dataLayer42 = new DataLayer();
        java.util.List<Payment> paymentList43 = dataLayer42.getAllPayments();
        Payment payment48 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str49 = payment48.getUserId();
        java.lang.String str50 = payment48.toString();
        boolean boolean51 = dataLayer42.savePayment(payment48);
        java.lang.String str52 = payment48.getTransactionId();
        double double53 = payment48.getAmount();
        businessLayer41.processPayment(payment48);
        java.util.List<Payment> paymentList55 = businessLayer41.getAllPayments();
        java.util.List<Payment> paymentList56 = businessLayer41.getAllPayments();
        DataLayer dataLayer57 = new DataLayer();
        Payment payment62 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str63 = payment62.getUserId();
        java.lang.String str64 = payment62.toString();
        boolean boolean65 = dataLayer57.savePayment(payment62);
        Payment payment67 = dataLayer57.getPaymentById("");
        java.lang.String str68 = payment67.getDescription();
        businessLayer41.processPayment(payment67);
        businessLayer36.processPayment(payment67);
        Payment payment72 = businessLayer36.getPaymentDetails("");
        java.util.List<Payment> paymentList73 = businessLayer36.getAllPayments();
        DataLayer dataLayer74 = new DataLayer();
        java.util.List<Payment> paymentList75 = dataLayer74.getAllPayments();
        BusinessLayer businessLayer76 = new BusinessLayer(dataLayer74);
        Payment payment78 = businessLayer76.getPaymentDetails("");
        java.util.List<Payment> paymentList79 = businessLayer76.getAllPayments();
        java.util.List<Payment> paymentList80 = businessLayer76.getAllPayments();
        DataLayer dataLayer81 = new DataLayer();
        java.util.List<Payment> paymentList82 = dataLayer81.getAllPayments();
        Payment payment87 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str88 = payment87.getUserId();
        java.lang.String str89 = payment87.toString();
        boolean boolean90 = dataLayer81.savePayment(payment87);
        double double91 = payment87.getAmount();
        businessLayer76.processPayment(payment87);
        businessLayer36.processPayment(payment87);
        boolean boolean94 = dataLayer0.savePayment(payment87);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str27, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentList35);
        org.junit.Assert.assertNull(payment38);
        org.junit.Assert.assertNotNull(paymentList40);
        org.junit.Assert.assertNotNull(paymentList43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str50, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList55);
        org.junit.Assert.assertNotNull(paymentList56);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str64, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(payment67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(payment72);
        org.junit.Assert.assertNotNull(paymentList73);
        org.junit.Assert.assertNotNull(paymentList75);
        org.junit.Assert.assertNull(payment78);
        org.junit.Assert.assertNotNull(paymentList79);
        org.junit.Assert.assertNotNull(paymentList80);
        org.junit.Assert.assertNotNull(paymentList82);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str89, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.getDescription();
        java.lang.String str7 = payment4.getDescription();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str5, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.getDescription();
        java.lang.String str9 = payment4.getDescription();
        java.lang.String str10 = payment4.getTransactionId();
        java.lang.String str11 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "hi!", (double) (byte) 10, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment9 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str10 = payment9.getTransactionId();
        businessLayer4.processPayment(payment9);
        java.util.List<Payment> paymentList12 = businessLayer4.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paymentList12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer44 = new DataLayer();
        java.util.List<Payment> paymentList45 = dataLayer44.getAllPayments();
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer44);
        Payment payment48 = businessLayer46.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList49 = businessLayer46.getAllPayments();
        Payment payment54 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str55 = payment54.getUserId();
        double double56 = payment54.getAmount();
        java.lang.String str57 = payment54.toString();
        businessLayer46.processPayment(payment54);
        double double59 = payment54.getAmount();
        boolean boolean60 = dataLayer0.savePayment(payment54);
        double double61 = payment54.getAmount();
        java.lang.String str62 = payment54.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertNull(payment48);
        org.junit.Assert.assertNotNull(paymentList49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str62, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        Payment payment6 = businessLayer2.getPaymentDetails("hi!");
        Payment payment8 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNull(payment8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer2.processPayment(payment22);
        Payment payment25 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList26 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(payment25);
        org.junit.Assert.assertNotNull(paymentList26);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment41 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.getDescription();
        boolean boolean44 = dataLayer0.savePayment(payment41);
        Payment payment46 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str42, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(payment46);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        java.lang.String str28 = payment21.getTransactionId();
        java.lang.Class<?> wildcardClass29 = payment21.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.lang.String str11 = payment8.toString();
        double double12 = payment8.getAmount();
        java.lang.String str13 = payment8.toString();
        double double14 = payment8.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str11, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str13, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment13 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str14 = payment13.getDescription();
        java.lang.String str15 = payment13.getTransactionId();
        boolean boolean16 = dataLayer0.savePayment(payment13);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        java.lang.Class<?> wildcardClass18 = paymentList17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        java.lang.String str42 = payment38.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", 10.0d, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList16 = businessLayer15.getAllPayments();
        Payment payment18 = businessLayer15.getPaymentDetails("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (-1), "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        java.lang.String str10 = payment6.getTransactionId();
        java.lang.Class<?> wildcardClass11 = payment6.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 10, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        Payment payment14 = businessLayer2.getPaymentDetails("");
        java.lang.Class<?> wildcardClass15 = businessLayer2.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(payment14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.lang.String str9 = payment7.getDescription();
        java.lang.String str10 = payment7.getUserId();
        java.lang.Class<?> wildcardClass11 = payment7.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        DataLayer dataLayer2 = new DataLayer();
        java.util.List<Payment> paymentList3 = dataLayer2.getAllPayments();
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer2);
        Payment payment6 = businessLayer4.getPaymentDetails("hi!");
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer7);
        Payment payment11 = businessLayer9.getPaymentDetails("");
        java.util.List<Payment> paymentList12 = businessLayer9.getAllPayments();
        java.util.List<Payment> paymentList13 = businessLayer9.getAllPayments();
        Payment payment18 = new Payment("", "hi!", 0.0d, "");
        businessLayer9.processPayment(payment18);
        Payment payment21 = businessLayer9.getPaymentDetails("");
        java.lang.String str22 = payment21.getUserId();
        businessLayer4.processPayment(payment21);
        java.lang.String str24 = payment21.getUserId();
        boolean boolean25 = dataLayer0.savePayment(payment21);
        java.lang.String str26 = payment21.getTransactionId();
        java.lang.String str27 = payment21.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(payment21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str27, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        BusinessLayer businessLayer42 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment13 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str14 = payment13.getDescription();
        java.lang.String str15 = payment13.getTransactionId();
        boolean boolean16 = dataLayer0.savePayment(payment13);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment8 = businessLayer2.getPaymentDetails("hi!");
        Payment payment10 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNull(payment10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) ' ', "hi!");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        DataLayer dataLayer12 = new DataLayer();
        java.util.List<Payment> paymentList13 = dataLayer12.getAllPayments();
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer12);
        Payment payment16 = businessLayer14.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList17 = businessLayer14.getAllPayments();
        Payment payment22 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str23 = payment22.getUserId();
        double double24 = payment22.getAmount();
        java.lang.String str25 = payment22.toString();
        businessLayer14.processPayment(payment22);
        boolean boolean27 = dataLayer0.savePayment(payment22);
        java.lang.Class<?> wildcardClass28 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNull(payment16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.getUserId();
        java.lang.String str8 = payment4.getTransactionId();
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "", (double) 100, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        java.lang.String str19 = payment15.toString();
        java.lang.Class<?> wildcardClass20 = payment15.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str19, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment17 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(payment17);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment13 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str14 = payment13.getDescription();
        java.lang.String str15 = payment13.getTransactionId();
        boolean boolean16 = dataLayer0.savePayment(payment13);
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment38 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(payment38);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer24 = new DataLayer();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer24.savePayment(payment29);
        Payment payment34 = dataLayer24.getPaymentById("");
        java.lang.String str35 = payment34.getTransactionId();
        boolean boolean36 = dataLayer0.savePayment(payment34);
        java.lang.String str37 = payment34.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(payment34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList3 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList4 = businessLayer2.getAllPayments();
        java.lang.Class<?> wildcardClass5 = businessLayer2.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        DataLayer dataLayer5 = new DataLayer();
        java.util.List<Payment> paymentList6 = dataLayer5.getAllPayments();
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer5);
        DataLayer dataLayer8 = new DataLayer();
        java.util.List<Payment> paymentList9 = dataLayer8.getAllPayments();
        Payment payment14 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str15 = payment14.getUserId();
        java.lang.String str16 = payment14.toString();
        boolean boolean17 = dataLayer8.savePayment(payment14);
        java.lang.String str18 = payment14.getTransactionId();
        double double19 = payment14.getAmount();
        businessLayer7.processPayment(payment14);
        java.util.List<Payment> paymentList21 = businessLayer7.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer7.getAllPayments();
        DataLayer dataLayer23 = new DataLayer();
        Payment payment28 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str29 = payment28.getUserId();
        java.lang.String str30 = payment28.toString();
        boolean boolean31 = dataLayer23.savePayment(payment28);
        Payment payment33 = dataLayer23.getPaymentById("");
        java.lang.String str34 = payment33.getDescription();
        businessLayer7.processPayment(payment33);
        businessLayer2.processPayment(payment33);
        Payment payment38 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList39 = businessLayer2.getAllPayments();
        DataLayer dataLayer40 = new DataLayer();
        java.util.List<Payment> paymentList41 = dataLayer40.getAllPayments();
        BusinessLayer businessLayer42 = new BusinessLayer(dataLayer40);
        Payment payment44 = businessLayer42.getPaymentDetails("");
        java.util.List<Payment> paymentList45 = businessLayer42.getAllPayments();
        java.util.List<Payment> paymentList46 = businessLayer42.getAllPayments();
        DataLayer dataLayer47 = new DataLayer();
        java.util.List<Payment> paymentList48 = dataLayer47.getAllPayments();
        Payment payment53 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str54 = payment53.getUserId();
        java.lang.String str55 = payment53.toString();
        boolean boolean56 = dataLayer47.savePayment(payment53);
        double double57 = payment53.getAmount();
        businessLayer42.processPayment(payment53);
        businessLayer2.processPayment(payment53);
        java.lang.String str60 = payment53.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str30, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(payment33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertNotNull(paymentList39);
        org.junit.Assert.assertNotNull(paymentList41);
        org.junit.Assert.assertNull(payment44);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertNotNull(paymentList46);
        org.junit.Assert.assertNotNull(paymentList48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str55, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        Payment payment16 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNull(payment16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment13 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str14 = payment13.getDescription();
        java.lang.String str15 = payment13.getTransactionId();
        boolean boolean16 = dataLayer0.savePayment(payment13);
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer18 = new DataLayer();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer18.savePayment(payment23);
        java.lang.String str27 = payment23.getDescription();
        boolean boolean28 = dataLayer0.savePayment(payment23);
        Payment payment30 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(payment30);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList3 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList4 = businessLayer2.getAllPayments();
        java.lang.Class<?> wildcardClass5 = paymentList4.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass3 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.getDescription();
        java.lang.String str7 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str5, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str7, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        Payment payment15 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str16 = payment15.getUserId();
        java.lang.String str17 = payment15.toString();
        boolean boolean18 = dataLayer10.savePayment(payment15);
        java.lang.String str19 = payment15.getDescription();
        java.lang.String str20 = payment15.toString();
        boolean boolean21 = dataLayer0.savePayment(payment15);
        DataLayer dataLayer22 = new DataLayer();
        java.util.List<Payment> paymentList23 = dataLayer22.getAllPayments();
        Payment payment25 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        java.lang.String str34 = payment32.toString();
        boolean boolean35 = dataLayer26.savePayment(payment32);
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        BusinessLayer businessLayer38 = new BusinessLayer(dataLayer36);
        Payment payment40 = businessLayer38.getPaymentDetails("");
        java.util.List<Payment> paymentList41 = businessLayer38.getAllPayments();
        java.util.List<Payment> paymentList42 = businessLayer38.getAllPayments();
        Payment payment47 = new Payment("", "hi!", 0.0d, "");
        businessLayer38.processPayment(payment47);
        boolean boolean49 = dataLayer26.savePayment(payment47);
        DataLayer dataLayer50 = new DataLayer();
        Payment payment55 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str56 = payment55.getUserId();
        java.lang.String str57 = payment55.toString();
        boolean boolean58 = dataLayer50.savePayment(payment55);
        Payment payment60 = dataLayer50.getPaymentById("");
        java.lang.String str61 = payment60.getTransactionId();
        boolean boolean62 = dataLayer26.savePayment(payment60);
        boolean boolean63 = dataLayer22.savePayment(payment60);
        Payment payment65 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer66 = new DataLayer();
        java.util.List<Payment> paymentList67 = dataLayer66.getAllPayments();
        BusinessLayer businessLayer68 = new BusinessLayer(dataLayer66);
        Payment payment70 = businessLayer68.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList71 = businessLayer68.getAllPayments();
        Payment payment76 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str77 = payment76.getUserId();
        double double78 = payment76.getAmount();
        java.lang.String str79 = payment76.toString();
        businessLayer68.processPayment(payment76);
        double double81 = payment76.getAmount();
        boolean boolean82 = dataLayer22.savePayment(payment76);
        boolean boolean83 = dataLayer0.savePayment(payment76);
        BusinessLayer businessLayer84 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList85 = dataLayer0.getAllPayments();
        DataLayer dataLayer86 = new DataLayer();
        java.util.List<Payment> paymentList87 = dataLayer86.getAllPayments();
        Payment payment92 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str93 = payment92.getUserId();
        java.lang.String str94 = payment92.toString();
        boolean boolean95 = dataLayer86.savePayment(payment92);
        java.lang.String str96 = payment92.getTransactionId();
        java.lang.String str97 = payment92.getDescription();
        java.lang.String str98 = payment92.getTransactionId();
        boolean boolean99 = dataLayer0.savePayment(payment92);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNull(payment25);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str34, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(payment40);
        org.junit.Assert.assertNotNull(paymentList41);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(payment60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(payment65);
        org.junit.Assert.assertNotNull(paymentList67);
        org.junit.Assert.assertNull(payment70);
        org.junit.Assert.assertNotNull(paymentList71);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str79, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(paymentList85);
        org.junit.Assert.assertNotNull(paymentList87);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str94, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment2 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNull(payment2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        double double7 = payment5.getAmount();
        java.lang.String str8 = payment5.toString();
        boolean boolean9 = dataLayer0.savePayment(payment5);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        Payment payment16 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str17 = payment16.getUserId();
        java.lang.String str18 = payment16.toString();
        boolean boolean19 = dataLayer10.savePayment(payment16);
        java.lang.String str20 = payment16.getDescription();
        java.lang.String str21 = payment16.getDescription();
        boolean boolean22 = dataLayer0.savePayment(payment16);
        double double23 = payment16.getAmount();
        java.lang.String str24 = payment16.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        Payment payment14 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        Payment payment19 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", 32.0d, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        double double20 = payment19.getAmount();
        businessLayer2.processPayment(payment19);
        java.lang.Class<?> wildcardClass22 = businessLayer2.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        java.lang.Class<?> wildcardClass3 = paymentList2.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.lang.Class<?> wildcardClass2 = paymentList1.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Payment payment4 = new Payment("", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 0.0f, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) (-1L), "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        double double5 = payment4.getAmount();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        double double10 = payment6.getAmount();
        java.lang.String str11 = payment6.getUserId();
        java.lang.String str12 = payment6.getUserId();
        java.lang.String str13 = payment6.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        DataLayer dataLayer2 = new DataLayer();
        java.util.List<Payment> paymentList3 = dataLayer2.getAllPayments();
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer2);
        Payment payment6 = businessLayer4.getPaymentDetails("hi!");
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer7);
        Payment payment11 = businessLayer9.getPaymentDetails("");
        java.util.List<Payment> paymentList12 = businessLayer9.getAllPayments();
        java.util.List<Payment> paymentList13 = businessLayer9.getAllPayments();
        Payment payment18 = new Payment("", "hi!", 0.0d, "");
        businessLayer9.processPayment(payment18);
        Payment payment21 = businessLayer9.getPaymentDetails("");
        java.lang.String str22 = payment21.getUserId();
        businessLayer4.processPayment(payment21);
        java.lang.String str24 = payment21.getUserId();
        boolean boolean25 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer26 = new DataLayer();
        Payment payment31 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str32 = payment31.getUserId();
        java.lang.String str33 = payment31.toString();
        boolean boolean34 = dataLayer26.savePayment(payment31);
        Payment payment39 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str40 = payment39.getDescription();
        java.lang.String str41 = payment39.getTransactionId();
        boolean boolean42 = dataLayer26.savePayment(payment39);
        boolean boolean43 = dataLayer0.savePayment(payment39);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(payment21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str33, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Payment payment4 = new Payment("", "hi!", 0.0d, "");
        double double5 = payment4.getAmount();
        java.lang.String str6 = payment4.toString();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.getUserId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str6, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str7, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer18);
        Payment payment22 = businessLayer20.getPaymentDetails("");
        java.util.List<Payment> paymentList23 = businessLayer20.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer20.getAllPayments();
        Payment payment29 = new Payment("", "hi!", 0.0d, "");
        businessLayer20.processPayment(payment29);
        Payment payment32 = businessLayer20.getPaymentDetails("");
        boolean boolean33 = dataLayer0.savePayment(payment32);
        java.lang.String str34 = payment32.getDescription();
        java.lang.String str35 = payment32.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(payment32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getDescription();
        java.lang.String str6 = payment4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer44 = new DataLayer();
        java.util.List<Payment> paymentList45 = dataLayer44.getAllPayments();
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer44);
        Payment payment48 = businessLayer46.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList49 = businessLayer46.getAllPayments();
        Payment payment54 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str55 = payment54.getUserId();
        double double56 = payment54.getAmount();
        java.lang.String str57 = payment54.toString();
        businessLayer46.processPayment(payment54);
        double double59 = payment54.getAmount();
        boolean boolean60 = dataLayer0.savePayment(payment54);
        java.lang.String str61 = payment54.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertNull(payment48);
        org.junit.Assert.assertNotNull(paymentList49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str61, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Payment payment4 = new Payment("hi!", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) 100L, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        double double5 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        java.util.List<Payment> paymentList5 = dataLayer3.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean11 = dataLayer3.savePayment(payment10);
        java.lang.String str12 = payment10.getDescription();
        boolean boolean13 = dataLayer0.savePayment(payment10);
        Payment payment15 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(payment15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.lang.String str11 = payment8.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        java.lang.String str10 = payment6.getTransactionId();
        java.lang.String str11 = payment6.getDescription();
        double double12 = payment6.getAmount();
        java.lang.String str13 = payment6.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        java.lang.String str10 = payment6.getTransactionId();
        double double11 = payment6.getAmount();
        java.lang.Class<?> wildcardClass12 = payment6.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer15);
        Payment payment19 = businessLayer17.getPaymentDetails("");
        java.util.List<Payment> paymentList20 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList21 = businessLayer17.getAllPayments();
        Payment payment26 = new Payment("", "hi!", 0.0d, "");
        businessLayer17.processPayment(payment26);
        Payment payment29 = businessLayer17.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList30 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList31 = businessLayer17.getAllPayments();
        Payment payment36 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str37 = payment36.getUserId();
        java.lang.String str38 = payment36.toString();
        java.lang.String str39 = payment36.toString();
        businessLayer17.processPayment(payment36);
        businessLayer2.processPayment(payment36);
        java.lang.String str42 = payment36.getTransactionId();
        java.lang.String str43 = payment36.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNull(payment29);
        org.junit.Assert.assertNotNull(paymentList30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str38, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str39, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        java.lang.Class<?> wildcardClass46 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", 32.0d, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getTransactionId();
        java.lang.String str6 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str5, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "", (double) 100.0f, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        Payment payment20 = dataLayer0.getPaymentById("");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(payment20);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList16 = businessLayer15.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer15.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str23 = payment22.getUserId();
        java.lang.String str24 = payment22.getDescription();
        businessLayer15.processPayment(payment22);
        java.lang.Class<?> wildcardClass26 = businessLayer15.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str23, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList12 = dataLayer0.getAllPayments();
        Payment payment14 = dataLayer0.getPaymentById("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(payment14);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList44 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNotNull(paymentList44);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        Payment payment15 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str16 = payment15.getUserId();
        java.lang.String str17 = payment15.toString();
        boolean boolean18 = dataLayer10.savePayment(payment15);
        java.lang.String str19 = payment15.getDescription();
        java.lang.String str20 = payment15.toString();
        boolean boolean21 = dataLayer0.savePayment(payment15);
        DataLayer dataLayer22 = new DataLayer();
        java.util.List<Payment> paymentList23 = dataLayer22.getAllPayments();
        Payment payment25 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        java.lang.String str34 = payment32.toString();
        boolean boolean35 = dataLayer26.savePayment(payment32);
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        BusinessLayer businessLayer38 = new BusinessLayer(dataLayer36);
        Payment payment40 = businessLayer38.getPaymentDetails("");
        java.util.List<Payment> paymentList41 = businessLayer38.getAllPayments();
        java.util.List<Payment> paymentList42 = businessLayer38.getAllPayments();
        Payment payment47 = new Payment("", "hi!", 0.0d, "");
        businessLayer38.processPayment(payment47);
        boolean boolean49 = dataLayer26.savePayment(payment47);
        DataLayer dataLayer50 = new DataLayer();
        Payment payment55 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str56 = payment55.getUserId();
        java.lang.String str57 = payment55.toString();
        boolean boolean58 = dataLayer50.savePayment(payment55);
        Payment payment60 = dataLayer50.getPaymentById("");
        java.lang.String str61 = payment60.getTransactionId();
        boolean boolean62 = dataLayer26.savePayment(payment60);
        boolean boolean63 = dataLayer22.savePayment(payment60);
        Payment payment65 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer66 = new DataLayer();
        java.util.List<Payment> paymentList67 = dataLayer66.getAllPayments();
        BusinessLayer businessLayer68 = new BusinessLayer(dataLayer66);
        Payment payment70 = businessLayer68.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList71 = businessLayer68.getAllPayments();
        Payment payment76 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str77 = payment76.getUserId();
        double double78 = payment76.getAmount();
        java.lang.String str79 = payment76.toString();
        businessLayer68.processPayment(payment76);
        double double81 = payment76.getAmount();
        boolean boolean82 = dataLayer22.savePayment(payment76);
        boolean boolean83 = dataLayer0.savePayment(payment76);
        Payment payment85 = dataLayer0.getPaymentById("");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNull(payment25);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str34, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(payment40);
        org.junit.Assert.assertNotNull(paymentList41);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(payment60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(payment65);
        org.junit.Assert.assertNotNull(paymentList67);
        org.junit.Assert.assertNull(payment70);
        org.junit.Assert.assertNotNull(paymentList71);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str79, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(payment85);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        BusinessLayer businessLayer37 = new BusinessLayer(dataLayer0);
        Payment payment39 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList40 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(payment39);
        org.junit.Assert.assertNotNull(paymentList40);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Payment payment4 = new Payment("hi!", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", 32.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        Payment payment19 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str20 = payment19.getUserId();
        boolean boolean21 = dataLayer0.savePayment(payment19);
        DataLayer dataLayer22 = new DataLayer();
        java.util.List<Payment> paymentList23 = dataLayer22.getAllPayments();
        BusinessLayer businessLayer24 = new BusinessLayer(dataLayer22);
        Payment payment26 = businessLayer24.getPaymentDetails("hi!");
        DataLayer dataLayer27 = new DataLayer();
        java.util.List<Payment> paymentList28 = dataLayer27.getAllPayments();
        BusinessLayer businessLayer29 = new BusinessLayer(dataLayer27);
        DataLayer dataLayer30 = new DataLayer();
        java.util.List<Payment> paymentList31 = dataLayer30.getAllPayments();
        Payment payment36 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str37 = payment36.getUserId();
        java.lang.String str38 = payment36.toString();
        boolean boolean39 = dataLayer30.savePayment(payment36);
        java.lang.String str40 = payment36.getTransactionId();
        double double41 = payment36.getAmount();
        businessLayer29.processPayment(payment36);
        java.util.List<Payment> paymentList43 = businessLayer29.getAllPayments();
        java.util.List<Payment> paymentList44 = businessLayer29.getAllPayments();
        DataLayer dataLayer45 = new DataLayer();
        Payment payment50 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str51 = payment50.getUserId();
        java.lang.String str52 = payment50.toString();
        boolean boolean53 = dataLayer45.savePayment(payment50);
        Payment payment55 = dataLayer45.getPaymentById("");
        java.lang.String str56 = payment55.getDescription();
        businessLayer29.processPayment(payment55);
        businessLayer24.processPayment(payment55);
        Payment payment60 = businessLayer24.getPaymentDetails("");
        boolean boolean61 = dataLayer0.savePayment(payment60);
        java.lang.String str62 = payment60.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNull(payment26);
        org.junit.Assert.assertNotNull(paymentList28);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str38, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList43);
        org.junit.Assert.assertNotNull(paymentList44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str52, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(payment55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(payment60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        java.lang.String str15 = payment10.getUserId();
        java.lang.String str16 = payment10.getDescription();
        java.lang.String str17 = payment10.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment7 = dataLayer4.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment12 = new Payment("", "hi!", 0.0d, "");
        double double13 = payment12.getAmount();
        boolean boolean14 = dataLayer4.savePayment(payment12);
        java.lang.String str15 = payment12.toString();
        double double16 = payment12.getAmount();
        java.lang.String str17 = payment12.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment12);
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        java.util.List<Payment> paymentList21 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str15, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList21);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        Payment payment14 = businessLayer2.getPaymentDetails("");
        java.lang.String str15 = payment14.getDescription();
        java.lang.String str16 = payment14.getDescription();
        java.lang.Class<?> wildcardClass17 = payment14.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(payment14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        Payment payment18 = dataLayer0.getPaymentById("");
        double double19 = payment18.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 10, "hi!");
        java.lang.String str5 = payment4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer11 = new DataLayer();
        java.util.List<Payment> paymentList12 = dataLayer11.getAllPayments();
        Payment payment14 = dataLayer11.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer11);
        Payment payment20 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str21 = payment20.getTransactionId();
        businessLayer15.processPayment(payment20);
        businessLayer10.processPayment(payment20);
        Payment payment25 = businessLayer10.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.util.List<Payment> paymentList26 = businessLayer10.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(payment25);
        org.junit.Assert.assertNotNull(paymentList26);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer18.savePayment(payment23);
        Payment payment28 = dataLayer18.getPaymentById("");
        java.lang.String str29 = payment28.getDescription();
        businessLayer2.processPayment(payment28);
        java.util.List<Payment> paymentList31 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(payment28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(paymentList31);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer18);
        DataLayer dataLayer21 = new DataLayer();
        java.util.List<Payment> paymentList22 = dataLayer21.getAllPayments();
        Payment payment27 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str28 = payment27.getUserId();
        java.lang.String str29 = payment27.toString();
        boolean boolean30 = dataLayer21.savePayment(payment27);
        java.lang.String str31 = payment27.getTransactionId();
        double double32 = payment27.getAmount();
        businessLayer20.processPayment(payment27);
        java.util.List<Payment> paymentList34 = businessLayer20.getAllPayments();
        DataLayer dataLayer35 = new DataLayer();
        java.util.List<Payment> paymentList36 = dataLayer35.getAllPayments();
        BusinessLayer businessLayer37 = new BusinessLayer(dataLayer35);
        Payment payment39 = businessLayer37.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList40 = businessLayer37.getAllPayments();
        Payment payment45 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str46 = payment45.getUserId();
        double double47 = payment45.getAmount();
        java.lang.String str48 = payment45.toString();
        businessLayer37.processPayment(payment45);
        businessLayer20.processPayment(payment45);
        java.lang.String str51 = payment45.getUserId();
        boolean boolean52 = dataLayer0.savePayment(payment45);
        BusinessLayer businessLayer53 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str29, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertNull(payment39);
        org.junit.Assert.assertNotNull(paymentList40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str48, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        double double10 = payment6.getAmount();
        java.lang.String str11 = payment6.getUserId();
        java.lang.String str12 = payment6.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.toString();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        Payment payment48 = dataLayer0.getPaymentById("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertNull(payment48);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer19 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment6 = businessLayer4.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList7 = businessLayer4.getAllPayments();
        java.util.List<Payment> paymentList8 = businessLayer4.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNotNull(paymentList8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer47 = new DataLayer();
        Payment payment52 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str53 = payment52.getUserId();
        java.lang.String str54 = payment52.toString();
        boolean boolean55 = dataLayer47.savePayment(payment52);
        java.lang.String str56 = payment52.getDescription();
        java.lang.String str57 = payment52.getTransactionId();
        boolean boolean58 = dataLayer0.savePayment(payment52);
        java.lang.String str59 = payment52.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str54, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment22 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNull(payment22);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList3 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment17 = businessLayer15.getPaymentDetails("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment19 = businessLayer15.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNull(payment19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment2 = dataLayer0.getPaymentById("hi!");
        Payment payment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dataLayer0.savePayment(payment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(payment2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) 0.0f, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer7);
        Payment payment11 = businessLayer9.getPaymentDetails("");
        java.util.List<Payment> paymentList12 = businessLayer9.getAllPayments();
        java.util.List<Payment> paymentList13 = businessLayer9.getAllPayments();
        Payment payment18 = new Payment("", "hi!", 0.0d, "");
        businessLayer9.processPayment(payment18);
        Payment payment21 = businessLayer9.getPaymentDetails("");
        businessLayer2.processPayment(payment21);
        Payment payment24 = businessLayer2.getPaymentDetails("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(payment21);
        org.junit.Assert.assertNull(payment24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer0);
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str16 = payment15.getDescription();
        businessLayer10.processPayment(payment15);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) (-1.0f), "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        Payment payment18 = dataLayer0.getPaymentById("");
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer21 = new BusinessLayer(dataLayer0);
        Payment payment23 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNull(payment23);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer11 = new DataLayer();
        java.util.List<Payment> paymentList12 = dataLayer11.getAllPayments();
        Payment payment14 = dataLayer11.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer11);
        Payment payment20 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str21 = payment20.getTransactionId();
        businessLayer15.processPayment(payment20);
        businessLayer10.processPayment(payment20);
        DataLayer dataLayer24 = new DataLayer();
        java.util.List<Payment> paymentList25 = dataLayer24.getAllPayments();
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        BusinessLayer businessLayer28 = new BusinessLayer(dataLayer26);
        Payment payment30 = businessLayer28.getPaymentDetails("hi!");
        DataLayer dataLayer31 = new DataLayer();
        java.util.List<Payment> paymentList32 = dataLayer31.getAllPayments();
        BusinessLayer businessLayer33 = new BusinessLayer(dataLayer31);
        Payment payment35 = businessLayer33.getPaymentDetails("");
        java.util.List<Payment> paymentList36 = businessLayer33.getAllPayments();
        java.util.List<Payment> paymentList37 = businessLayer33.getAllPayments();
        Payment payment42 = new Payment("", "hi!", 0.0d, "");
        businessLayer33.processPayment(payment42);
        Payment payment45 = businessLayer33.getPaymentDetails("");
        java.lang.String str46 = payment45.getUserId();
        businessLayer28.processPayment(payment45);
        java.lang.String str48 = payment45.getUserId();
        boolean boolean49 = dataLayer24.savePayment(payment45);
        java.lang.String str50 = payment45.getTransactionId();
        businessLayer10.processPayment(payment45);
        java.lang.String str52 = payment45.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertNull(payment30);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNull(payment35);
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNotNull(payment45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str52, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 1L, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        double double5 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.lang.String str11 = payment8.toString();
        java.lang.String str12 = payment8.getDescription();
        java.lang.Class<?> wildcardClass13 = payment8.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str11, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment9 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str10 = payment9.getTransactionId();
        businessLayer4.processPayment(payment9);
        Payment payment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            businessLayer4.processPayment(payment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        Payment payment51 = new Payment("", "", (double) 10.0f, "hi!");
        boolean boolean52 = dataLayer0.savePayment(payment51);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 1, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dataLayer0.savePayment(payment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        Payment payment9 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList10 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList11 = businessLayer2.getAllPayments();
        Payment payment16 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "", (double) 0.0f, "");
        java.lang.String str17 = payment16.getDescription();
        businessLayer2.processPayment(payment16);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment14 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment18 = dataLayer15.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment23 = new Payment("", "hi!", 0.0d, "");
        double double24 = payment23.getAmount();
        boolean boolean25 = dataLayer15.savePayment(payment23);
        java.lang.String str26 = payment23.toString();
        double double27 = payment23.getAmount();
        java.lang.String str28 = payment23.getDescription();
        boolean boolean29 = dataLayer0.savePayment(payment23);
        Payment payment31 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        BusinessLayer businessLayer32 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str26, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(payment31);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        Payment payment15 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str16 = payment15.getUserId();
        java.lang.String str17 = payment15.toString();
        boolean boolean18 = dataLayer10.savePayment(payment15);
        java.lang.String str19 = payment15.getDescription();
        java.lang.String str20 = payment15.toString();
        boolean boolean21 = dataLayer0.savePayment(payment15);
        DataLayer dataLayer22 = new DataLayer();
        java.util.List<Payment> paymentList23 = dataLayer22.getAllPayments();
        Payment payment25 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        java.lang.String str34 = payment32.toString();
        boolean boolean35 = dataLayer26.savePayment(payment32);
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        BusinessLayer businessLayer38 = new BusinessLayer(dataLayer36);
        Payment payment40 = businessLayer38.getPaymentDetails("");
        java.util.List<Payment> paymentList41 = businessLayer38.getAllPayments();
        java.util.List<Payment> paymentList42 = businessLayer38.getAllPayments();
        Payment payment47 = new Payment("", "hi!", 0.0d, "");
        businessLayer38.processPayment(payment47);
        boolean boolean49 = dataLayer26.savePayment(payment47);
        DataLayer dataLayer50 = new DataLayer();
        Payment payment55 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str56 = payment55.getUserId();
        java.lang.String str57 = payment55.toString();
        boolean boolean58 = dataLayer50.savePayment(payment55);
        Payment payment60 = dataLayer50.getPaymentById("");
        java.lang.String str61 = payment60.getTransactionId();
        boolean boolean62 = dataLayer26.savePayment(payment60);
        boolean boolean63 = dataLayer22.savePayment(payment60);
        Payment payment65 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer66 = new DataLayer();
        java.util.List<Payment> paymentList67 = dataLayer66.getAllPayments();
        BusinessLayer businessLayer68 = new BusinessLayer(dataLayer66);
        Payment payment70 = businessLayer68.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList71 = businessLayer68.getAllPayments();
        Payment payment76 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str77 = payment76.getUserId();
        double double78 = payment76.getAmount();
        java.lang.String str79 = payment76.toString();
        businessLayer68.processPayment(payment76);
        double double81 = payment76.getAmount();
        boolean boolean82 = dataLayer22.savePayment(payment76);
        boolean boolean83 = dataLayer0.savePayment(payment76);
        BusinessLayer businessLayer84 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer85 = new DataLayer();
        java.util.List<Payment> paymentList86 = dataLayer85.getAllPayments();
        java.util.List<Payment> paymentList87 = dataLayer85.getAllPayments();
        Payment payment92 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean93 = dataLayer85.savePayment(payment92);
        double double94 = payment92.getAmount();
        boolean boolean95 = dataLayer0.savePayment(payment92);
        Payment payment97 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNull(payment25);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str34, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(payment40);
        org.junit.Assert.assertNotNull(paymentList41);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(payment60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(payment65);
        org.junit.Assert.assertNotNull(paymentList67);
        org.junit.Assert.assertNull(payment70);
        org.junit.Assert.assertNotNull(paymentList71);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str79, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(paymentList86);
        org.junit.Assert.assertNotNull(paymentList87);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 10.0d + "'", double94 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(payment97);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList16 = businessLayer15.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer15.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str23 = payment22.getUserId();
        java.lang.String str24 = payment22.getDescription();
        businessLayer15.processPayment(payment22);
        double double26 = payment22.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str23, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        Payment payment14 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str15 = payment14.getUserId();
        java.lang.String str16 = payment14.getUserId();
        java.lang.String str17 = payment14.getUserId();
        double double18 = payment14.getAmount();
        boolean boolean19 = dataLayer0.savePayment(payment14);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        Payment payment13 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str14 = payment13.getUserId();
        java.lang.String str15 = payment13.toString();
        boolean boolean16 = dataLayer7.savePayment(payment13);
        double double17 = payment13.getAmount();
        businessLayer2.processPayment(payment13);
        java.lang.String str19 = payment13.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str15, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment7 = dataLayer4.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment12 = new Payment("", "hi!", 0.0d, "");
        double double13 = payment12.getAmount();
        boolean boolean14 = dataLayer4.savePayment(payment12);
        java.lang.String str15 = payment12.toString();
        double double16 = payment12.getAmount();
        java.lang.String str17 = payment12.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment12);
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        java.util.List<Payment> paymentList21 = dataLayer19.getAllPayments();
        Payment payment26 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean27 = dataLayer19.savePayment(payment26);
        java.util.List<Payment> paymentList28 = dataLayer19.getAllPayments();
        Payment payment30 = dataLayer19.getPaymentById("");
        java.lang.String str31 = payment30.getUserId();
        boolean boolean32 = dataLayer0.savePayment(payment30);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str15, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentList28);
        org.junit.Assert.assertNotNull(payment30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer12 = new DataLayer();
        java.util.List<Payment> paymentList13 = dataLayer12.getAllPayments();
        Payment payment15 = dataLayer12.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer16);
        Payment payment20 = businessLayer18.getPaymentDetails("");
        java.util.List<Payment> paymentList21 = businessLayer18.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer18.getAllPayments();
        Payment payment27 = new Payment("", "hi!", 0.0d, "");
        businessLayer18.processPayment(payment27);
        java.lang.String str29 = payment27.getDescription();
        boolean boolean30 = dataLayer12.savePayment(payment27);
        java.lang.String str31 = payment27.getTransactionId();
        businessLayer11.processPayment(payment27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNull(payment15);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        java.util.List<Payment> paymentList24 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer25 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paymentList24);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList5 = dataLayer0.getAllPayments();
        DataLayer dataLayer6 = new DataLayer();
        Payment payment11 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str12 = payment11.getUserId();
        java.lang.String str13 = payment11.toString();
        boolean boolean14 = dataLayer6.savePayment(payment11);
        Payment payment16 = dataLayer6.getPaymentById("");
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer6);
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean23 = dataLayer6.savePayment(payment22);
        boolean boolean24 = dataLayer0.savePayment(payment22);
        Payment payment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dataLayer0.savePayment(payment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(payment16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "hi!", 0.0d, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment7 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment7);
        Payment payment10 = businessLayer2.getPaymentDetails("");
        java.lang.String str11 = payment10.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer18.savePayment(payment23);
        Payment payment28 = dataLayer18.getPaymentById("");
        java.lang.String str29 = payment28.getDescription();
        businessLayer2.processPayment(payment28);
        java.lang.String str31 = payment28.getDescription();
        java.lang.String str32 = payment28.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(payment28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        java.util.List<Payment> paymentList13 = businessLayer2.getAllPayments();
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        DataLayer dataLayer17 = new DataLayer();
        java.util.List<Payment> paymentList18 = dataLayer17.getAllPayments();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer17.savePayment(payment23);
        java.lang.String str27 = payment23.getTransactionId();
        double double28 = payment23.getAmount();
        businessLayer16.processPayment(payment23);
        java.util.List<Payment> paymentList30 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList31 = businessLayer16.getAllPayments();
        Payment payment36 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer16.processPayment(payment36);
        java.lang.String str38 = payment36.getDescription();
        businessLayer2.processPayment(payment36);
        java.lang.String str40 = payment36.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}" + "'", str40, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer18);
        Payment payment22 = businessLayer20.getPaymentDetails("");
        java.util.List<Payment> paymentList23 = businessLayer20.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer20.getAllPayments();
        Payment payment29 = new Payment("", "hi!", 0.0d, "");
        businessLayer20.processPayment(payment29);
        Payment payment32 = businessLayer20.getPaymentDetails("");
        boolean boolean33 = dataLayer0.savePayment(payment32);
        java.lang.String str34 = payment32.getDescription();
        java.lang.String str35 = payment32.getUserId();
        java.lang.String str36 = payment32.getTransactionId();
        java.lang.String str37 = payment32.getDescription();
        java.lang.String str38 = payment32.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(payment32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        Payment payment16 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNull(payment16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer15);
        Payment payment19 = businessLayer17.getPaymentDetails("");
        java.util.List<Payment> paymentList20 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList21 = businessLayer17.getAllPayments();
        Payment payment26 = new Payment("", "hi!", 0.0d, "");
        businessLayer17.processPayment(payment26);
        Payment payment29 = businessLayer17.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList30 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList31 = businessLayer17.getAllPayments();
        Payment payment36 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str37 = payment36.getUserId();
        java.lang.String str38 = payment36.toString();
        java.lang.String str39 = payment36.toString();
        businessLayer17.processPayment(payment36);
        businessLayer2.processPayment(payment36);
        java.util.List<Payment> paymentList42 = businessLayer2.getAllPayments();
        Payment payment44 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNull(payment29);
        org.junit.Assert.assertNotNull(paymentList30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str38, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str39, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertNull(payment44);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "", (double) (short) 1, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 1L, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getTransactionId();
        java.lang.String str6 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str5, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer12 = new DataLayer();
        java.util.List<Payment> paymentList13 = dataLayer12.getAllPayments();
        java.util.List<Payment> paymentList14 = dataLayer12.getAllPayments();
        Payment payment16 = dataLayer12.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer17 = new DataLayer();
        Payment payment22 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str23 = payment22.getUserId();
        java.lang.String str24 = payment22.toString();
        boolean boolean25 = dataLayer17.savePayment(payment22);
        boolean boolean26 = dataLayer12.savePayment(payment22);
        java.lang.String str27 = payment22.getUserId();
        boolean boolean28 = dataLayer0.savePayment(payment22);
        java.util.List<Payment> paymentList29 = dataLayer0.getAllPayments();
        Payment payment30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = dataLayer0.savePayment(payment30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(paymentList14);
        org.junit.Assert.assertNull(payment16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paymentList29);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        DataLayer dataLayer2 = new DataLayer();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str8 = payment7.getUserId();
        java.lang.String str9 = payment7.toString();
        boolean boolean10 = dataLayer2.savePayment(payment7);
        Payment payment12 = dataLayer2.getPaymentById("");
        BusinessLayer businessLayer13 = new BusinessLayer(dataLayer2);
        Payment payment18 = new Payment("", "hi!", 0.0d, "");
        double double19 = payment18.getAmount();
        java.lang.String str20 = payment18.toString();
        businessLayer13.processPayment(payment18);
        boolean boolean22 = dataLayer0.savePayment(payment18);
        Payment payment24 = dataLayer0.getPaymentById("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str9, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(payment12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str20, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(payment24);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment13 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) '4', "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.lang.String str5 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        Payment payment14 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList15 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        Payment payment18 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        Payment payment20 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNull(payment20);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList8 = businessLayer2.getAllPayments();
        DataLayer dataLayer9 = new DataLayer();
        java.util.List<Payment> paymentList10 = dataLayer9.getAllPayments();
        java.util.List<Payment> paymentList11 = dataLayer9.getAllPayments();
        Payment payment13 = dataLayer9.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList14 = dataLayer9.getAllPayments();
        java.util.List<Payment> paymentList15 = dataLayer9.getAllPayments();
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer16);
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        Payment payment25 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str26 = payment25.getUserId();
        java.lang.String str27 = payment25.toString();
        boolean boolean28 = dataLayer19.savePayment(payment25);
        java.lang.String str29 = payment25.getTransactionId();
        double double30 = payment25.getAmount();
        businessLayer18.processPayment(payment25);
        java.util.List<Payment> paymentList32 = businessLayer18.getAllPayments();
        java.util.List<Payment> paymentList33 = businessLayer18.getAllPayments();
        Payment payment38 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer18.processPayment(payment38);
        boolean boolean40 = dataLayer9.savePayment(payment38);
        businessLayer2.processPayment(payment38);
        Payment payment46 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "", (double) 10.0f, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        businessLayer2.processPayment(payment46);
        java.lang.String str48 = payment46.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertNotNull(paymentList14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str27, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str48, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        java.lang.String str13 = payment11.getDescription();
        java.lang.Class<?> wildcardClass14 = payment11.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment17 = new Payment("hi!", "hi!", 10.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean18 = dataLayer0.savePayment(payment17);
        BusinessLayer businessLayer19 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer24 = new DataLayer();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer24.savePayment(payment29);
        Payment payment34 = dataLayer24.getPaymentById("");
        java.lang.String str35 = payment34.getTransactionId();
        boolean boolean36 = dataLayer0.savePayment(payment34);
        java.lang.String str37 = payment34.toString();
        java.lang.String str38 = payment34.getUserId();
        java.lang.String str39 = payment34.getUserId();
        java.lang.String str40 = payment34.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(payment34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str37, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer2.processPayment(payment22);
        java.util.List<Payment> paymentList24 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList24);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment13 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str14 = payment13.getDescription();
        java.lang.String str15 = payment13.getTransactionId();
        boolean boolean16 = dataLayer0.savePayment(payment13);
        java.lang.Class<?> wildcardClass17 = dataLayer0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) (-1L), "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.lang.String str5 = payment4.toString();
        java.lang.String str6 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}" + "'", str6, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        Payment payment14 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList15 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment19 = businessLayer2.getPaymentDetails("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment19);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer15);
        Payment payment19 = businessLayer17.getPaymentDetails("");
        java.util.List<Payment> paymentList20 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList21 = businessLayer17.getAllPayments();
        Payment payment26 = new Payment("", "hi!", 0.0d, "");
        businessLayer17.processPayment(payment26);
        Payment payment29 = businessLayer17.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList30 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList31 = businessLayer17.getAllPayments();
        Payment payment36 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str37 = payment36.getUserId();
        java.lang.String str38 = payment36.toString();
        java.lang.String str39 = payment36.toString();
        businessLayer17.processPayment(payment36);
        businessLayer2.processPayment(payment36);
        java.util.List<Payment> paymentList42 = businessLayer2.getAllPayments();
        Payment payment47 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", 0.0d, "hi!");
        businessLayer2.processPayment(payment47);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNull(payment29);
        org.junit.Assert.assertNotNull(paymentList30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str38, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str39, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList42);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.toString();
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getUserId();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        DataLayer dataLayer8 = new DataLayer();
        Payment payment13 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str14 = payment13.getUserId();
        java.lang.String str15 = payment13.toString();
        boolean boolean16 = dataLayer8.savePayment(payment13);
        Payment payment18 = dataLayer8.getPaymentById("");
        BusinessLayer businessLayer19 = new BusinessLayer(dataLayer8);
        Payment payment24 = new Payment("hi!", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 'a', "");
        businessLayer19.processPayment(payment24);
        businessLayer2.processPayment(payment24);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str15, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(payment18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        PresentationLayer presentationLayer0 = new PresentationLayer();
        presentationLayer0.start();
        presentationLayer0.start();
        presentationLayer0.start();
        presentationLayer0.start();
        presentationLayer0.start();
        presentationLayer0.start();
        presentationLayer0.start();
        presentationLayer0.start();
        presentationLayer0.start();
        presentationLayer0.start();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment17 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str18 = payment17.getUserId();
        businessLayer12.processPayment(payment17);
        java.lang.String str20 = payment17.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str18, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList4 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer47 = new DataLayer();
        Payment payment52 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str53 = payment52.getUserId();
        java.lang.String str54 = payment52.toString();
        boolean boolean55 = dataLayer47.savePayment(payment52);
        java.lang.String str56 = payment52.getDescription();
        java.lang.String str57 = payment52.getTransactionId();
        boolean boolean58 = dataLayer0.savePayment(payment52);
        Payment payment60 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer61 = new BusinessLayer(dataLayer0);
        Payment payment63 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str54, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(payment60);
        org.junit.Assert.assertNull(payment63);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean17 = dataLayer0.savePayment(payment16);
        java.lang.String str18 = payment16.getDescription();
        java.lang.String str19 = payment16.toString();
        java.lang.String str20 = payment16.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str19, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str20, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) (short) 0, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        java.lang.String str5 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer47 = new DataLayer();
        Payment payment52 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str53 = payment52.getUserId();
        java.lang.String str54 = payment52.toString();
        boolean boolean55 = dataLayer47.savePayment(payment52);
        java.lang.String str56 = payment52.getDescription();
        java.lang.String str57 = payment52.getTransactionId();
        boolean boolean58 = dataLayer0.savePayment(payment52);
        Payment payment60 = dataLayer0.getPaymentById("");
        java.lang.Class<?> wildcardClass61 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str54, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(payment60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList3 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList4 = businessLayer2.getAllPayments();
        Payment payment6 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNull(payment6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment41 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.getDescription();
        boolean boolean44 = dataLayer0.savePayment(payment41);
        BusinessLayer businessLayer45 = new BusinessLayer(dataLayer0);
        Payment payment50 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 100, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.lang.String str51 = payment50.getTransactionId();
        boolean boolean52 = dataLayer0.savePayment(payment50);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str42, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str51, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment2 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList4 = businessLayer3.getAllPayments();
        java.lang.Class<?> wildcardClass5 = paymentList4.getClass();
        org.junit.Assert.assertNull(payment2);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer21 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer22 = new DataLayer();
        java.util.List<Payment> paymentList23 = dataLayer22.getAllPayments();
        Payment payment25 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        BusinessLayer businessLayer28 = new BusinessLayer(dataLayer26);
        Payment payment30 = businessLayer28.getPaymentDetails("");
        java.util.List<Payment> paymentList31 = businessLayer28.getAllPayments();
        java.util.List<Payment> paymentList32 = businessLayer28.getAllPayments();
        Payment payment37 = new Payment("", "hi!", 0.0d, "");
        businessLayer28.processPayment(payment37);
        java.lang.String str39 = payment37.getDescription();
        boolean boolean40 = dataLayer22.savePayment(payment37);
        businessLayer21.processPayment(payment37);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNull(payment25);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertNull(payment30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) 1L, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer44 = new DataLayer();
        java.util.List<Payment> paymentList45 = dataLayer44.getAllPayments();
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer44);
        Payment payment48 = businessLayer46.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList49 = businessLayer46.getAllPayments();
        Payment payment54 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str55 = payment54.getUserId();
        double double56 = payment54.getAmount();
        java.lang.String str57 = payment54.toString();
        businessLayer46.processPayment(payment54);
        double double59 = payment54.getAmount();
        boolean boolean60 = dataLayer0.savePayment(payment54);
        Payment payment65 = new Payment("", "hi!", 0.0d, "");
        double double66 = payment65.getAmount();
        boolean boolean67 = dataLayer0.savePayment(payment65);
        java.util.List<Payment> paymentList68 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertNull(payment48);
        org.junit.Assert.assertNotNull(paymentList49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(paymentList68);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment18 = new Payment("hi!", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) 1.0f, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean19 = dataLayer0.savePayment(payment18);
        Payment payment21 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(payment21);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        double double9 = payment7.getAmount();
        java.lang.String str10 = payment7.getUserId();
        java.lang.String str11 = payment7.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 100L, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) 10L, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = dataLayer0.getPaymentById("hi!");
        Payment payment9 = new Payment("hi!", "hi!", (double) (short) 0, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        double double10 = payment9.getAmount();
        boolean boolean11 = dataLayer0.savePayment(payment9);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        Payment payment18 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer19 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer20 = new DataLayer();
        java.util.List<Payment> paymentList21 = dataLayer20.getAllPayments();
        Payment payment23 = dataLayer20.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer24 = new DataLayer();
        java.util.List<Payment> paymentList25 = dataLayer24.getAllPayments();
        Payment payment30 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str31 = payment30.getUserId();
        java.lang.String str32 = payment30.toString();
        boolean boolean33 = dataLayer24.savePayment(payment30);
        DataLayer dataLayer34 = new DataLayer();
        java.util.List<Payment> paymentList35 = dataLayer34.getAllPayments();
        BusinessLayer businessLayer36 = new BusinessLayer(dataLayer34);
        Payment payment38 = businessLayer36.getPaymentDetails("");
        java.util.List<Payment> paymentList39 = businessLayer36.getAllPayments();
        java.util.List<Payment> paymentList40 = businessLayer36.getAllPayments();
        Payment payment45 = new Payment("", "hi!", 0.0d, "");
        businessLayer36.processPayment(payment45);
        boolean boolean47 = dataLayer24.savePayment(payment45);
        DataLayer dataLayer48 = new DataLayer();
        Payment payment53 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str54 = payment53.getUserId();
        java.lang.String str55 = payment53.toString();
        boolean boolean56 = dataLayer48.savePayment(payment53);
        Payment payment58 = dataLayer48.getPaymentById("");
        java.lang.String str59 = payment58.getTransactionId();
        boolean boolean60 = dataLayer24.savePayment(payment58);
        boolean boolean61 = dataLayer20.savePayment(payment58);
        Payment payment63 = dataLayer20.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment65 = dataLayer20.getPaymentById("hi!");
        BusinessLayer businessLayer66 = new BusinessLayer(dataLayer20);
        DataLayer dataLayer67 = new DataLayer();
        java.util.List<Payment> paymentList68 = dataLayer67.getAllPayments();
        Payment payment73 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str74 = payment73.getUserId();
        java.lang.String str75 = payment73.toString();
        boolean boolean76 = dataLayer67.savePayment(payment73);
        java.lang.String str77 = payment73.getDescription();
        java.lang.String str78 = payment73.getDescription();
        businessLayer66.processPayment(payment73);
        businessLayer19.processPayment(payment73);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNull(payment23);
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str32, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentList35);
        org.junit.Assert.assertNull(payment38);
        org.junit.Assert.assertNotNull(paymentList39);
        org.junit.Assert.assertNotNull(paymentList40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str55, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(payment58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(payment63);
        org.junit.Assert.assertNull(payment65);
        org.junit.Assert.assertNotNull(paymentList68);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str75, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment18 = new Payment("hi!", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) 1.0f, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean19 = dataLayer0.savePayment(payment18);
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer0);
        Payment payment22 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        Payment payment24 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        BusinessLayer businessLayer25 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertNull(payment24);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("");
        java.util.List<Payment> paymentList12 = dataLayer0.getAllPayments();
        Payment payment14 = dataLayer0.getPaymentById("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(payment14);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", (double) (byte) 100, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.lang.String str5 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}", (double) 1.0f, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment38 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.util.List<Payment> paymentList39 = dataLayer0.getAllPayments();
        Payment payment41 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(payment38);
        org.junit.Assert.assertNotNull(paymentList39);
        org.junit.Assert.assertNull(payment41);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList5 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList6 = dataLayer0.getAllPayments();
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer7);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        Payment payment16 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str17 = payment16.getUserId();
        java.lang.String str18 = payment16.toString();
        boolean boolean19 = dataLayer10.savePayment(payment16);
        java.lang.String str20 = payment16.getTransactionId();
        double double21 = payment16.getAmount();
        businessLayer9.processPayment(payment16);
        java.util.List<Payment> paymentList23 = businessLayer9.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer9.getAllPayments();
        Payment payment29 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer9.processPayment(payment29);
        boolean boolean31 = dataLayer0.savePayment(payment29);
        java.lang.String str32 = payment29.getDescription();
        java.lang.String str33 = payment29.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList10 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.getTransactionId();
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getDescription();
        java.lang.String str11 = payment4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 10, "hi!");
        double double5 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer12 = new DataLayer();
        java.util.List<Payment> paymentList13 = dataLayer12.getAllPayments();
        java.util.List<Payment> paymentList14 = dataLayer12.getAllPayments();
        Payment payment16 = dataLayer12.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer17 = new DataLayer();
        Payment payment22 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str23 = payment22.getUserId();
        java.lang.String str24 = payment22.toString();
        boolean boolean25 = dataLayer17.savePayment(payment22);
        boolean boolean26 = dataLayer12.savePayment(payment22);
        java.lang.String str27 = payment22.getUserId();
        boolean boolean28 = dataLayer0.savePayment(payment22);
        BusinessLayer businessLayer29 = new BusinessLayer(dataLayer0);
        Payment payment30 = null;
        // The following exception was thrown during execution in test generation
        try {
            businessLayer29.processPayment(payment30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(paymentList14);
        org.junit.Assert.assertNull(payment16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        java.lang.String str10 = payment6.getDescription();
        java.lang.Class<?> wildcardClass11 = payment6.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList16 = businessLayer15.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer15.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str23 = payment22.getUserId();
        java.lang.String str24 = payment22.getDescription();
        businessLayer15.processPayment(payment22);
        java.lang.String str26 = payment22.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str23, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str26, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        DataLayer dataLayer12 = new DataLayer();
        java.util.List<Payment> paymentList13 = dataLayer12.getAllPayments();
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer12);
        Payment payment16 = businessLayer14.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList17 = businessLayer14.getAllPayments();
        Payment payment22 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str23 = payment22.getUserId();
        double double24 = payment22.getAmount();
        java.lang.String str25 = payment22.toString();
        businessLayer14.processPayment(payment22);
        boolean boolean27 = dataLayer0.savePayment(payment22);
        BusinessLayer businessLayer28 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNull(payment16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Payment payment4 = new Payment("hi!", "", (double) ' ', "");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer28 = new DataLayer();
        java.util.List<Payment> paymentList29 = dataLayer28.getAllPayments();
        Payment payment31 = dataLayer28.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment36 = new Payment("", "hi!", 0.0d, "");
        double double37 = payment36.getAmount();
        boolean boolean38 = dataLayer28.savePayment(payment36);
        java.lang.String str39 = payment36.toString();
        double double40 = payment36.getAmount();
        java.lang.String str41 = payment36.getDescription();
        boolean boolean42 = dataLayer0.savePayment(payment36);
        Payment payment44 = dataLayer0.getPaymentById("");
        java.lang.String str45 = payment44.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paymentList29);
        org.junit.Assert.assertNull(payment31);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str39, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(payment44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) (byte) 1, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer18);
        Payment payment22 = businessLayer20.getPaymentDetails("");
        java.util.List<Payment> paymentList23 = businessLayer20.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer20.getAllPayments();
        Payment payment29 = new Payment("", "hi!", 0.0d, "");
        businessLayer20.processPayment(payment29);
        Payment payment32 = businessLayer20.getPaymentDetails("");
        boolean boolean33 = dataLayer0.savePayment(payment32);
        java.util.List<Payment> paymentList34 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList35 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(payment32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertNotNull(paymentList35);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment2 = dataLayer0.getPaymentById("hi!");
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer3);
        Payment payment7 = businessLayer5.getPaymentDetails("");
        java.util.List<Payment> paymentList8 = businessLayer5.getAllPayments();
        java.util.List<Payment> paymentList9 = businessLayer5.getAllPayments();
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        Payment payment16 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str17 = payment16.getUserId();
        java.lang.String str18 = payment16.toString();
        boolean boolean19 = dataLayer10.savePayment(payment16);
        double double20 = payment16.getAmount();
        businessLayer5.processPayment(payment16);
        boolean boolean22 = dataLayer0.savePayment(payment16);
        java.lang.Class<?> wildcardClass23 = payment16.getClass();
        org.junit.Assert.assertNull(payment2);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNull(payment7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer18);
        Payment payment22 = businessLayer20.getPaymentDetails("");
        java.util.List<Payment> paymentList23 = businessLayer20.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer20.getAllPayments();
        Payment payment29 = new Payment("", "hi!", 0.0d, "");
        businessLayer20.processPayment(payment29);
        Payment payment32 = businessLayer20.getPaymentDetails("");
        boolean boolean33 = dataLayer0.savePayment(payment32);
        BusinessLayer businessLayer34 = new BusinessLayer(dataLayer0);
        Payment payment36 = businessLayer34.getPaymentDetails("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(payment32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(payment36);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("hi!", "", (-1.0d), "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        businessLayer11.processPayment(payment16);
        Payment payment19 = businessLayer11.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment19);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        Payment payment9 = businessLayer2.getPaymentDetails("");
        Payment payment11 = businessLayer2.getPaymentDetails("");
        Payment payment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            businessLayer2.processPayment(payment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNull(payment11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Payment payment4 = new Payment("hi!", "", (double) 0.0f, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.lang.String str5 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}" + "'", str5, "Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", 32.0d, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.toString();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        java.util.List<Payment> paymentList13 = businessLayer2.getAllPayments();
        DataLayer dataLayer14 = new DataLayer();
        Payment payment19 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str20 = payment19.getUserId();
        java.lang.String str21 = payment19.toString();
        boolean boolean22 = dataLayer14.savePayment(payment19);
        Payment payment24 = dataLayer14.getPaymentById("");
        businessLayer2.processPayment(payment24);
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        BusinessLayer businessLayer28 = new BusinessLayer(dataLayer26);
        Payment payment30 = businessLayer28.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList31 = businessLayer28.getAllPayments();
        Payment payment36 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str37 = payment36.getUserId();
        double double38 = payment36.getAmount();
        java.lang.String str39 = payment36.toString();
        businessLayer28.processPayment(payment36);
        double double41 = payment36.getAmount();
        java.lang.String str42 = payment36.getDescription();
        java.lang.String str43 = payment36.getUserId();
        businessLayer2.processPayment(payment36);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str21, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(payment24);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertNull(payment30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str39, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment13 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str14 = payment13.getDescription();
        java.lang.String str15 = payment13.getTransactionId();
        boolean boolean16 = dataLayer0.savePayment(payment13);
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer18 = new DataLayer();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer18.savePayment(payment23);
        java.lang.String str27 = payment23.getDescription();
        boolean boolean28 = dataLayer0.savePayment(payment23);
        java.lang.String str29 = payment23.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str29, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment41 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.getDescription();
        boolean boolean44 = dataLayer0.savePayment(payment41);
        Payment payment46 = dataLayer0.getPaymentById("");
        java.lang.String str47 = payment46.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str42, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(payment46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass5 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        Payment payment9 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList10 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList11 = businessLayer2.getAllPayments();
        Payment payment13 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer6 = new DataLayer();
        java.util.List<Payment> paymentList7 = dataLayer6.getAllPayments();
        Payment payment9 = dataLayer6.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer6);
        Payment payment15 = new Payment("hi!", "", (double) 100.0f, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        businessLayer10.processPayment(payment15);
        businessLayer5.processPayment(payment15);
        java.lang.String str18 = payment15.getTransactionId();
        java.lang.String str19 = payment15.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}" + "'", str19, "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment41 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.getDescription();
        boolean boolean44 = dataLayer0.savePayment(payment41);
        java.lang.String str45 = payment41.getTransactionId();
        java.lang.String str46 = payment41.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str42, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str45, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str46, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.lang.String str11 = payment8.toString();
        double double12 = payment8.getAmount();
        java.lang.String str13 = payment8.toString();
        java.lang.String str14 = payment8.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str11, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str13, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList16 = businessLayer15.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer15.getAllPayments();
        java.util.List<Payment> paymentList18 = businessLayer15.getAllPayments();
        Payment payment20 = businessLayer15.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertNull(payment20);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer47 = new DataLayer();
        java.util.List<Payment> paymentList48 = dataLayer47.getAllPayments();
        java.util.List<Payment> paymentList49 = dataLayer47.getAllPayments();
        Payment payment54 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean55 = dataLayer47.savePayment(payment54);
        Payment payment57 = dataLayer47.getPaymentById("hi!");
        BusinessLayer businessLayer58 = new BusinessLayer(dataLayer47);
        DataLayer dataLayer59 = new DataLayer();
        java.util.List<Payment> paymentList60 = dataLayer59.getAllPayments();
        java.util.List<Payment> paymentList61 = dataLayer59.getAllPayments();
        Payment payment63 = dataLayer59.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer64 = new DataLayer();
        Payment payment69 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str70 = payment69.getUserId();
        java.lang.String str71 = payment69.toString();
        boolean boolean72 = dataLayer64.savePayment(payment69);
        boolean boolean73 = dataLayer59.savePayment(payment69);
        java.lang.String str74 = payment69.getUserId();
        boolean boolean75 = dataLayer47.savePayment(payment69);
        boolean boolean76 = dataLayer0.savePayment(payment69);
        java.util.List<Payment> paymentList77 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertNotNull(paymentList48);
        org.junit.Assert.assertNotNull(paymentList49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(payment57);
        org.junit.Assert.assertNotNull(paymentList60);
        org.junit.Assert.assertNotNull(paymentList61);
        org.junit.Assert.assertNull(payment63);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str71, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(paymentList77);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.toString();
        java.lang.String str9 = payment4.getUserId();
        double double10 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Payment payment4 = new Payment("hi!", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        java.lang.Class<?> wildcardClass3 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment18 = new Payment("hi!", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) 1.0f, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean19 = dataLayer0.savePayment(payment18);
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass21 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment19 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList20 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(payment19);
        org.junit.Assert.assertNotNull(paymentList20);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment13 = dataLayer0.getPaymentById("hi!");
        java.lang.Class<?> wildcardClass14 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        double double10 = payment6.getAmount();
        java.lang.String str11 = payment6.getUserId();
        java.lang.String str12 = payment6.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", (double) (-1), "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList4 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "hi!", 10.0d, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Payment payment4 = new Payment("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", 100.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 10L, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        DataLayer dataLayer2 = new DataLayer();
        java.util.List<Payment> paymentList3 = dataLayer2.getAllPayments();
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer2);
        Payment payment6 = businessLayer4.getPaymentDetails("hi!");
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer7);
        Payment payment11 = businessLayer9.getPaymentDetails("");
        java.util.List<Payment> paymentList12 = businessLayer9.getAllPayments();
        java.util.List<Payment> paymentList13 = businessLayer9.getAllPayments();
        Payment payment18 = new Payment("", "hi!", 0.0d, "");
        businessLayer9.processPayment(payment18);
        Payment payment21 = businessLayer9.getPaymentDetails("");
        java.lang.String str22 = payment21.getUserId();
        businessLayer4.processPayment(payment21);
        java.lang.String str24 = payment21.getUserId();
        boolean boolean25 = dataLayer0.savePayment(payment21);
        java.lang.String str26 = payment21.getTransactionId();
        java.lang.String str27 = payment21.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(payment21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer24 = new DataLayer();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer24.savePayment(payment29);
        Payment payment34 = dataLayer24.getPaymentById("");
        java.lang.String str35 = payment34.getTransactionId();
        boolean boolean36 = dataLayer0.savePayment(payment34);
        double double37 = payment34.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(payment34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment18 = new Payment("hi!", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) 1.0f, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean19 = dataLayer0.savePayment(payment18);
        Payment payment21 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(payment21);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) '#', "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        Payment payment48 = dataLayer0.getPaymentById("");
        DataLayer dataLayer49 = new DataLayer();
        java.util.List<Payment> paymentList50 = dataLayer49.getAllPayments();
        java.util.List<Payment> paymentList51 = dataLayer49.getAllPayments();
        Payment payment56 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean57 = dataLayer49.savePayment(payment56);
        Payment payment59 = dataLayer49.getPaymentById("hi!");
        Payment payment64 = new Payment("", "hi!", 0.0d, "");
        boolean boolean65 = dataLayer49.savePayment(payment64);
        java.util.List<Payment> paymentList66 = dataLayer49.getAllPayments();
        DataLayer dataLayer67 = new DataLayer();
        java.util.List<Payment> paymentList68 = dataLayer67.getAllPayments();
        BusinessLayer businessLayer69 = new BusinessLayer(dataLayer67);
        Payment payment71 = businessLayer69.getPaymentDetails("");
        java.util.List<Payment> paymentList72 = businessLayer69.getAllPayments();
        java.util.List<Payment> paymentList73 = businessLayer69.getAllPayments();
        Payment payment78 = new Payment("", "hi!", 0.0d, "");
        businessLayer69.processPayment(payment78);
        Payment payment81 = businessLayer69.getPaymentDetails("");
        boolean boolean82 = dataLayer49.savePayment(payment81);
        java.lang.String str83 = payment81.getDescription();
        java.lang.String str84 = payment81.getUserId();
        java.lang.String str85 = payment81.getTransactionId();
        java.lang.String str86 = payment81.getDescription();
        boolean boolean87 = dataLayer0.savePayment(payment81);
        Payment payment92 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", (double) '4', "");
        boolean boolean93 = dataLayer0.savePayment(payment92);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertNotNull(payment48);
        org.junit.Assert.assertNotNull(paymentList50);
        org.junit.Assert.assertNotNull(paymentList51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(payment59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(paymentList66);
        org.junit.Assert.assertNotNull(paymentList68);
        org.junit.Assert.assertNull(payment71);
        org.junit.Assert.assertNotNull(paymentList72);
        org.junit.Assert.assertNotNull(paymentList73);
        org.junit.Assert.assertNotNull(payment81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment6 = dataLayer0.getPaymentById("");
        Payment payment8 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNull(payment8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer6 = new DataLayer();
        java.util.List<Payment> paymentList7 = dataLayer6.getAllPayments();
        Payment payment9 = dataLayer6.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer6);
        Payment payment15 = new Payment("hi!", "", (double) 100.0f, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        businessLayer10.processPayment(payment15);
        businessLayer5.processPayment(payment15);
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        java.util.List<Payment> paymentList20 = dataLayer18.getAllPayments();
        Payment payment22 = dataLayer18.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer23 = new DataLayer();
        Payment payment28 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str29 = payment28.getUserId();
        java.lang.String str30 = payment28.toString();
        boolean boolean31 = dataLayer23.savePayment(payment28);
        boolean boolean32 = dataLayer18.savePayment(payment28);
        BusinessLayer businessLayer33 = new BusinessLayer(dataLayer18);
        java.util.List<Payment> paymentList34 = businessLayer33.getAllPayments();
        java.util.List<Payment> paymentList35 = businessLayer33.getAllPayments();
        Payment payment40 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str41 = payment40.getUserId();
        java.lang.String str42 = payment40.getDescription();
        businessLayer33.processPayment(payment40);
        DataLayer dataLayer44 = new DataLayer();
        Payment payment49 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str50 = payment49.getUserId();
        java.lang.String str51 = payment49.toString();
        boolean boolean52 = dataLayer44.savePayment(payment49);
        businessLayer33.processPayment(payment49);
        businessLayer5.processPayment(payment49);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str30, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertNotNull(paymentList35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str41, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str42, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str51, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Payment payment4 = new Payment("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (double) (byte) 0, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Payment payment4 = new Payment("hi!", "", (double) (-1.0f), "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "hi!", (double) '#', "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean17 = dataLayer0.savePayment(payment16);
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer0);
        java.lang.Class<?> wildcardClass19 = businessLayer18.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer7);
        Payment payment11 = businessLayer9.getPaymentDetails("");
        java.util.List<Payment> paymentList12 = businessLayer9.getAllPayments();
        java.util.List<Payment> paymentList13 = businessLayer9.getAllPayments();
        Payment payment18 = new Payment("", "hi!", 0.0d, "");
        businessLayer9.processPayment(payment18);
        Payment payment21 = businessLayer9.getPaymentDetails("");
        businessLayer2.processPayment(payment21);
        Payment payment24 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(payment21);
        org.junit.Assert.assertNull(payment24);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList16 = businessLayer15.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer15.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str23 = payment22.getUserId();
        java.lang.String str24 = payment22.getDescription();
        businessLayer15.processPayment(payment22);
        DataLayer dataLayer26 = new DataLayer();
        Payment payment31 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str32 = payment31.getUserId();
        java.lang.String str33 = payment31.toString();
        boolean boolean34 = dataLayer26.savePayment(payment31);
        businessLayer15.processPayment(payment31);
        java.lang.Class<?> wildcardClass36 = payment31.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str23, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str33, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList5 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList6 = dataLayer0.getAllPayments();
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer7);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        Payment payment16 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str17 = payment16.getUserId();
        java.lang.String str18 = payment16.toString();
        boolean boolean19 = dataLayer10.savePayment(payment16);
        java.lang.String str20 = payment16.getTransactionId();
        double double21 = payment16.getAmount();
        businessLayer9.processPayment(payment16);
        java.util.List<Payment> paymentList23 = businessLayer9.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer9.getAllPayments();
        Payment payment29 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer9.processPayment(payment29);
        boolean boolean31 = dataLayer0.savePayment(payment29);
        java.util.List<Payment> paymentList32 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentList32);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment17 = businessLayer15.getPaymentDetails("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment19 = businessLayer15.getPaymentDetails("hi!");
        DataLayer dataLayer20 = new DataLayer();
        Payment payment25 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str26 = payment25.getUserId();
        java.lang.String str27 = payment25.toString();
        boolean boolean28 = dataLayer20.savePayment(payment25);
        Payment payment30 = dataLayer20.getPaymentById("");
        BusinessLayer businessLayer31 = new BusinessLayer(dataLayer20);
        Payment payment36 = new Payment("", "hi!", 0.0d, "");
        double double37 = payment36.getAmount();
        java.lang.String str38 = payment36.toString();
        businessLayer31.processPayment(payment36);
        businessLayer15.processPayment(payment36);
        Payment payment42 = businessLayer15.getPaymentDetails("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str27, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(payment30);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str38, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNull(payment42);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment13 = dataLayer0.getPaymentById("hi!");
        DataLayer dataLayer14 = new DataLayer();
        Payment payment19 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str20 = payment19.getUserId();
        double double21 = payment19.getAmount();
        java.lang.String str22 = payment19.toString();
        boolean boolean23 = dataLayer14.savePayment(payment19);
        DataLayer dataLayer24 = new DataLayer();
        java.util.List<Payment> paymentList25 = dataLayer24.getAllPayments();
        Payment payment30 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str31 = payment30.getUserId();
        java.lang.String str32 = payment30.toString();
        boolean boolean33 = dataLayer24.savePayment(payment30);
        java.lang.String str34 = payment30.getDescription();
        java.lang.String str35 = payment30.getDescription();
        boolean boolean36 = dataLayer14.savePayment(payment30);
        boolean boolean37 = dataLayer0.savePayment(payment30);
        Payment payment39 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str22, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str32, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(payment39);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}", "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", (double) '#', "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        java.lang.String str28 = payment21.getTransactionId();
        java.lang.String str29 = payment21.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(payment20);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment38 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        Payment payment43 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) ' ', "hi!");
        boolean boolean44 = dataLayer0.savePayment(payment43);
        java.util.List<Payment> paymentList45 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(payment38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paymentList45);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment17 = businessLayer15.getPaymentDetails("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment19 = businessLayer15.getPaymentDetails("hi!");
        Payment payment21 = businessLayer15.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList22 = businessLayer15.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertNull(payment21);
        org.junit.Assert.assertNotNull(paymentList22);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.getTransactionId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        Payment payment18 = dataLayer0.getPaymentById("");
        java.lang.String str19 = payment18.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer5 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer6 = new DataLayer();
        java.util.List<Payment> paymentList7 = dataLayer6.getAllPayments();
        Payment payment9 = dataLayer6.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer6);
        Payment payment15 = new Payment("hi!", "", (double) 100.0f, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        businessLayer10.processPayment(payment15);
        businessLayer5.processPayment(payment15);
        DataLayer dataLayer18 = new DataLayer();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer18.savePayment(payment23);
        java.lang.String str27 = payment23.getDescription();
        java.lang.String str28 = payment23.toString();
        java.lang.String str29 = payment23.getDescription();
        businessLayer5.processPayment(payment23);
        Payment payment35 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str36 = payment35.getUserId();
        double double37 = payment35.getAmount();
        java.lang.String str38 = payment35.toString();
        double double39 = payment35.getAmount();
        businessLayer5.processPayment(payment35);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str28, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str38, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Payment payment4 = new Payment("hi!", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (double) 100L, "hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer24 = new DataLayer();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer24.savePayment(payment29);
        Payment payment34 = dataLayer24.getPaymentById("");
        java.lang.String str35 = payment34.getTransactionId();
        boolean boolean36 = dataLayer0.savePayment(payment34);
        java.lang.String str37 = payment34.toString();
        java.lang.String str38 = payment34.getUserId();
        java.lang.String str39 = payment34.toString();
        java.lang.String str40 = payment34.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(payment34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str37, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str39, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment14 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment19 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str20 = payment19.getDescription();
        double double21 = payment19.getAmount();
        boolean boolean22 = dataLayer0.savePayment(payment19);
        double double23 = payment19.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        Payment payment13 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str14 = payment13.getUserId();
        java.lang.String str15 = payment13.toString();
        boolean boolean16 = dataLayer7.savePayment(payment13);
        double double17 = payment13.getAmount();
        businessLayer2.processPayment(payment13);
        double double19 = payment13.getAmount();
        java.lang.String str20 = payment13.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str15, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        java.lang.String str24 = payment21.toString();
        java.lang.String str25 = payment21.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str24, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        java.util.List<Payment> paymentList15 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList15);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("", "hi!", 0.0d, "");
        double double17 = payment16.getAmount();
        java.lang.String str18 = payment16.toString();
        businessLayer11.processPayment(payment16);
        double double20 = payment16.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str18, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList12 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer13 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("hi!");
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        BusinessLayer businessLayer21 = new BusinessLayer(dataLayer19);
        Payment payment23 = businessLayer21.getPaymentDetails("");
        java.util.List<Payment> paymentList24 = businessLayer21.getAllPayments();
        java.util.List<Payment> paymentList25 = businessLayer21.getAllPayments();
        Payment payment30 = new Payment("", "hi!", 0.0d, "");
        businessLayer21.processPayment(payment30);
        Payment payment33 = businessLayer21.getPaymentDetails("");
        java.lang.String str34 = payment33.getUserId();
        businessLayer16.processPayment(payment33);
        java.lang.String str36 = payment33.getUserId();
        boolean boolean37 = dataLayer0.savePayment(payment33);
        java.lang.String str38 = payment33.getTransactionId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNull(payment23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertNotNull(payment33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) 10, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str5, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.getUserId();
        java.lang.String str8 = payment4.getDescription();
        java.lang.String str9 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str9, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment7 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment7);
        Payment payment10 = businessLayer2.getPaymentDetails("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment2 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        java.util.List<Payment> paymentList6 = dataLayer4.getAllPayments();
        Payment payment8 = dataLayer4.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer9 = new DataLayer();
        Payment payment14 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str15 = payment14.getUserId();
        java.lang.String str16 = payment14.toString();
        boolean boolean17 = dataLayer9.savePayment(payment14);
        boolean boolean18 = dataLayer4.savePayment(payment14);
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        Payment payment25 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str26 = payment25.getUserId();
        java.lang.String str27 = payment25.toString();
        boolean boolean28 = dataLayer19.savePayment(payment25);
        double double29 = payment25.getAmount();
        java.lang.String str30 = payment25.getUserId();
        boolean boolean31 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer32 = new DataLayer();
        java.util.List<Payment> paymentList33 = dataLayer32.getAllPayments();
        Payment payment35 = dataLayer32.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment40 = new Payment("", "hi!", 0.0d, "");
        double double41 = payment40.getAmount();
        boolean boolean42 = dataLayer32.savePayment(payment40);
        java.lang.String str43 = payment40.toString();
        double double44 = payment40.getAmount();
        java.lang.String str45 = payment40.getDescription();
        boolean boolean46 = dataLayer4.savePayment(payment40);
        boolean boolean47 = dataLayer0.savePayment(payment40);
        org.junit.Assert.assertNull(payment2);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str27, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNull(payment35);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str43, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment41 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.getDescription();
        boolean boolean44 = dataLayer0.savePayment(payment41);
        java.util.List<Payment> paymentList45 = dataLayer0.getAllPayments();
        DataLayer dataLayer46 = new DataLayer();
        java.util.List<Payment> paymentList47 = dataLayer46.getAllPayments();
        BusinessLayer businessLayer48 = new BusinessLayer(dataLayer46);
        BusinessLayer businessLayer49 = new BusinessLayer(dataLayer46);
        DataLayer dataLayer50 = new DataLayer();
        java.util.List<Payment> paymentList51 = dataLayer50.getAllPayments();
        BusinessLayer businessLayer52 = new BusinessLayer(dataLayer50);
        Payment payment54 = businessLayer52.getPaymentDetails("hi!");
        DataLayer dataLayer55 = new DataLayer();
        java.util.List<Payment> paymentList56 = dataLayer55.getAllPayments();
        BusinessLayer businessLayer57 = new BusinessLayer(dataLayer55);
        Payment payment59 = businessLayer57.getPaymentDetails("");
        java.util.List<Payment> paymentList60 = businessLayer57.getAllPayments();
        java.util.List<Payment> paymentList61 = businessLayer57.getAllPayments();
        Payment payment66 = new Payment("", "hi!", 0.0d, "");
        businessLayer57.processPayment(payment66);
        Payment payment69 = businessLayer57.getPaymentDetails("");
        java.lang.String str70 = payment69.getUserId();
        businessLayer52.processPayment(payment69);
        businessLayer49.processPayment(payment69);
        java.lang.String str73 = payment69.getUserId();
        boolean boolean74 = dataLayer0.savePayment(payment69);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str42, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertNotNull(paymentList47);
        org.junit.Assert.assertNotNull(paymentList51);
        org.junit.Assert.assertNull(payment54);
        org.junit.Assert.assertNotNull(paymentList56);
        org.junit.Assert.assertNull(payment59);
        org.junit.Assert.assertNotNull(paymentList60);
        org.junit.Assert.assertNotNull(paymentList61);
        org.junit.Assert.assertNotNull(payment69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        Payment payment9 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList10 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList11 = businessLayer2.getAllPayments();
        Payment payment13 = businessLayer2.getPaymentDetails("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (double) 10.0f, "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        Payment payment5 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment5);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment14 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment18 = dataLayer15.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment23 = new Payment("", "hi!", 0.0d, "");
        double double24 = payment23.getAmount();
        boolean boolean25 = dataLayer15.savePayment(payment23);
        java.lang.String str26 = payment23.toString();
        double double27 = payment23.getAmount();
        java.lang.String str28 = payment23.getDescription();
        boolean boolean29 = dataLayer0.savePayment(payment23);
        Payment payment31 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        java.util.List<Payment> paymentList32 = dataLayer0.getAllPayments();
        java.lang.Class<?> wildcardClass33 = paymentList32.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str26, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(payment31);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer4.savePayment(payment10);
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        java.util.List<Payment> paymentList20 = businessLayer16.getAllPayments();
        Payment payment25 = new Payment("", "hi!", 0.0d, "");
        businessLayer16.processPayment(payment25);
        boolean boolean27 = dataLayer4.savePayment(payment25);
        DataLayer dataLayer28 = new DataLayer();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer28.savePayment(payment33);
        Payment payment38 = dataLayer28.getPaymentById("");
        java.lang.String str39 = payment38.getTransactionId();
        boolean boolean40 = dataLayer4.savePayment(payment38);
        boolean boolean41 = dataLayer0.savePayment(payment38);
        Payment payment43 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment45 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer46 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer47 = new DataLayer();
        java.util.List<Payment> paymentList48 = dataLayer47.getAllPayments();
        java.util.List<Payment> paymentList49 = dataLayer47.getAllPayments();
        Payment payment54 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean55 = dataLayer47.savePayment(payment54);
        Payment payment57 = dataLayer47.getPaymentById("hi!");
        BusinessLayer businessLayer58 = new BusinessLayer(dataLayer47);
        DataLayer dataLayer59 = new DataLayer();
        java.util.List<Payment> paymentList60 = dataLayer59.getAllPayments();
        java.util.List<Payment> paymentList61 = dataLayer59.getAllPayments();
        Payment payment63 = dataLayer59.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer64 = new DataLayer();
        Payment payment69 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str70 = payment69.getUserId();
        java.lang.String str71 = payment69.toString();
        boolean boolean72 = dataLayer64.savePayment(payment69);
        boolean boolean73 = dataLayer59.savePayment(payment69);
        java.lang.String str74 = payment69.getUserId();
        boolean boolean75 = dataLayer47.savePayment(payment69);
        boolean boolean76 = dataLayer0.savePayment(payment69);
        Payment payment78 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertNotNull(paymentList48);
        org.junit.Assert.assertNotNull(paymentList49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(payment57);
        org.junit.Assert.assertNotNull(paymentList60);
        org.junit.Assert.assertNotNull(paymentList61);
        org.junit.Assert.assertNull(payment63);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str71, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(payment78);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.getUserId();
        java.lang.String str7 = payment4.getUserId();
        java.lang.String str8 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer16);
        Payment payment20 = businessLayer18.getPaymentDetails("");
        java.util.List<Payment> paymentList21 = businessLayer18.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer18.getAllPayments();
        Payment payment27 = new Payment("", "hi!", 0.0d, "");
        businessLayer18.processPayment(payment27);
        java.lang.String str29 = payment27.getDescription();
        businessLayer15.processPayment(payment27);
        java.util.List<Payment> paymentList31 = businessLayer15.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(paymentList31);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        Payment payment4 = new Payment("hi!", "hi!", (double) (short) 0, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        double double5 = payment4.getAmount();
        java.lang.String str6 = payment4.getDescription();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        java.util.List<Payment> paymentList5 = dataLayer3.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean11 = dataLayer3.savePayment(payment10);
        java.lang.String str12 = payment10.getDescription();
        boolean boolean13 = dataLayer0.savePayment(payment10);
        java.lang.String str14 = payment10.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList8 = businessLayer2.getAllPayments();
        Payment payment10 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNull(payment10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment22 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str23 = payment22.getUserId();
        double double24 = payment22.getAmount();
        java.lang.String str25 = payment22.toString();
        businessLayer2.processPayment(payment22);
        DataLayer dataLayer27 = new DataLayer();
        java.util.List<Payment> paymentList28 = dataLayer27.getAllPayments();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer27.savePayment(payment33);
        BusinessLayer businessLayer37 = new BusinessLayer(dataLayer27);
        DataLayer dataLayer38 = new DataLayer();
        java.util.List<Payment> paymentList39 = dataLayer38.getAllPayments();
        Payment payment41 = dataLayer38.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer42 = new BusinessLayer(dataLayer38);
        Payment payment47 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str48 = payment47.getTransactionId();
        businessLayer42.processPayment(payment47);
        businessLayer37.processPayment(payment47);
        DataLayer dataLayer51 = new DataLayer();
        java.util.List<Payment> paymentList52 = dataLayer51.getAllPayments();
        DataLayer dataLayer53 = new DataLayer();
        java.util.List<Payment> paymentList54 = dataLayer53.getAllPayments();
        BusinessLayer businessLayer55 = new BusinessLayer(dataLayer53);
        Payment payment57 = businessLayer55.getPaymentDetails("hi!");
        DataLayer dataLayer58 = new DataLayer();
        java.util.List<Payment> paymentList59 = dataLayer58.getAllPayments();
        BusinessLayer businessLayer60 = new BusinessLayer(dataLayer58);
        Payment payment62 = businessLayer60.getPaymentDetails("");
        java.util.List<Payment> paymentList63 = businessLayer60.getAllPayments();
        java.util.List<Payment> paymentList64 = businessLayer60.getAllPayments();
        Payment payment69 = new Payment("", "hi!", 0.0d, "");
        businessLayer60.processPayment(payment69);
        Payment payment72 = businessLayer60.getPaymentDetails("");
        java.lang.String str73 = payment72.getUserId();
        businessLayer55.processPayment(payment72);
        java.lang.String str75 = payment72.getUserId();
        boolean boolean76 = dataLayer51.savePayment(payment72);
        java.lang.String str77 = payment72.getTransactionId();
        businessLayer37.processPayment(payment72);
        businessLayer2.processPayment(payment72);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentList39);
        org.junit.Assert.assertNull(payment41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(paymentList52);
        org.junit.Assert.assertNotNull(paymentList54);
        org.junit.Assert.assertNull(payment57);
        org.junit.Assert.assertNotNull(paymentList59);
        org.junit.Assert.assertNull(payment62);
        org.junit.Assert.assertNotNull(paymentList63);
        org.junit.Assert.assertNotNull(paymentList64);
        org.junit.Assert.assertNotNull(payment72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList16 = businessLayer15.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer15.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str23 = payment22.getUserId();
        java.lang.String str24 = payment22.getDescription();
        businessLayer15.processPayment(payment22);
        DataLayer dataLayer26 = new DataLayer();
        Payment payment31 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str32 = payment31.getUserId();
        java.lang.String str33 = payment31.toString();
        boolean boolean34 = dataLayer26.savePayment(payment31);
        businessLayer15.processPayment(payment31);
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        java.util.List<Payment> paymentList38 = dataLayer36.getAllPayments();
        Payment payment43 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean44 = dataLayer36.savePayment(payment43);
        Payment payment46 = dataLayer36.getPaymentById("hi!");
        Payment payment51 = new Payment("", "hi!", 0.0d, "");
        boolean boolean52 = dataLayer36.savePayment(payment51);
        java.util.List<Payment> paymentList53 = dataLayer36.getAllPayments();
        DataLayer dataLayer54 = new DataLayer();
        java.util.List<Payment> paymentList55 = dataLayer54.getAllPayments();
        BusinessLayer businessLayer56 = new BusinessLayer(dataLayer54);
        Payment payment58 = businessLayer56.getPaymentDetails("");
        java.util.List<Payment> paymentList59 = businessLayer56.getAllPayments();
        java.util.List<Payment> paymentList60 = businessLayer56.getAllPayments();
        Payment payment65 = new Payment("", "hi!", 0.0d, "");
        businessLayer56.processPayment(payment65);
        Payment payment68 = businessLayer56.getPaymentDetails("");
        boolean boolean69 = dataLayer36.savePayment(payment68);
        java.lang.String str70 = payment68.getDescription();
        java.lang.String str71 = payment68.getUserId();
        java.lang.String str72 = payment68.getTransactionId();
        java.lang.String str73 = payment68.getDescription();
        businessLayer15.processPayment(payment68);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str23, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str33, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNotNull(paymentList38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(payment46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(paymentList53);
        org.junit.Assert.assertNotNull(paymentList55);
        org.junit.Assert.assertNull(payment58);
        org.junit.Assert.assertNotNull(paymentList59);
        org.junit.Assert.assertNotNull(paymentList60);
        org.junit.Assert.assertNotNull(payment68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        Payment payment14 = businessLayer2.getPaymentDetails("");
        Payment payment16 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(payment14);
        org.junit.Assert.assertNull(payment16);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList16 = businessLayer15.getAllPayments();
        Payment payment18 = businessLayer15.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.util.List<Payment> paymentList19 = businessLayer15.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer2.processPayment(payment22);
        java.lang.String str24 = payment22.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}" + "'", str24, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer18);
        Payment payment22 = businessLayer20.getPaymentDetails("");
        java.util.List<Payment> paymentList23 = businessLayer20.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer20.getAllPayments();
        Payment payment29 = new Payment("", "hi!", 0.0d, "");
        businessLayer20.processPayment(payment29);
        Payment payment32 = businessLayer20.getPaymentDetails("");
        boolean boolean33 = dataLayer0.savePayment(payment32);
        BusinessLayer businessLayer34 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer35 = new DataLayer();
        java.util.List<Payment> paymentList36 = dataLayer35.getAllPayments();
        java.util.List<Payment> paymentList37 = dataLayer35.getAllPayments();
        Payment payment42 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean43 = dataLayer35.savePayment(payment42);
        Payment payment45 = dataLayer35.getPaymentById("hi!");
        Payment payment50 = new Payment("", "hi!", 0.0d, "");
        boolean boolean51 = dataLayer35.savePayment(payment50);
        java.util.List<Payment> paymentList52 = dataLayer35.getAllPayments();
        DataLayer dataLayer53 = new DataLayer();
        java.util.List<Payment> paymentList54 = dataLayer53.getAllPayments();
        BusinessLayer businessLayer55 = new BusinessLayer(dataLayer53);
        Payment payment57 = businessLayer55.getPaymentDetails("");
        java.util.List<Payment> paymentList58 = businessLayer55.getAllPayments();
        java.util.List<Payment> paymentList59 = businessLayer55.getAllPayments();
        Payment payment64 = new Payment("", "hi!", 0.0d, "");
        businessLayer55.processPayment(payment64);
        Payment payment67 = businessLayer55.getPaymentDetails("");
        boolean boolean68 = dataLayer35.savePayment(payment67);
        java.lang.String str69 = payment67.getDescription();
        java.lang.String str70 = payment67.getUserId();
        java.lang.String str71 = payment67.getTransactionId();
        boolean boolean72 = dataLayer0.savePayment(payment67);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(payment32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(payment45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(paymentList52);
        org.junit.Assert.assertNotNull(paymentList54);
        org.junit.Assert.assertNull(payment57);
        org.junit.Assert.assertNotNull(paymentList58);
        org.junit.Assert.assertNotNull(paymentList59);
        org.junit.Assert.assertNotNull(payment67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.toString();
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getUserId();
        java.lang.String str11 = payment4.getDescription();
        java.lang.String str12 = payment4.getUserId();
        java.lang.String str13 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.getUserId();
        java.lang.String str8 = payment4.getDescription();
        java.lang.String str9 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        Payment payment4 = new Payment("", "", 0.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment38 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.util.List<Payment> paymentList39 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer40 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer41 = new DataLayer();
        java.util.List<Payment> paymentList42 = dataLayer41.getAllPayments();
        BusinessLayer businessLayer43 = new BusinessLayer(dataLayer41);
        DataLayer dataLayer44 = new DataLayer();
        java.util.List<Payment> paymentList45 = dataLayer44.getAllPayments();
        Payment payment50 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str51 = payment50.getUserId();
        java.lang.String str52 = payment50.toString();
        boolean boolean53 = dataLayer44.savePayment(payment50);
        java.lang.String str54 = payment50.getTransactionId();
        double double55 = payment50.getAmount();
        businessLayer43.processPayment(payment50);
        java.util.List<Payment> paymentList57 = businessLayer43.getAllPayments();
        java.util.List<Payment> paymentList58 = businessLayer43.getAllPayments();
        Payment payment63 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer43.processPayment(payment63);
        java.lang.String str65 = payment63.getDescription();
        boolean boolean66 = dataLayer0.savePayment(payment63);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(payment38);
        org.junit.Assert.assertNotNull(paymentList39);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str52, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList57);
        org.junit.Assert.assertNotNull(paymentList58);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        Payment payment4 = new Payment("", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 0L, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        double double5 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList13 = dataLayer0.getAllPayments();
        java.lang.Class<?> wildcardClass14 = paymentList13.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "hi!", 0.0d, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment17 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str18 = payment17.getUserId();
        businessLayer12.processPayment(payment17);
        java.util.List<Payment> paymentList20 = businessLayer12.getAllPayments();
        Payment payment25 = new Payment("", "hi!", (double) 0, "");
        businessLayer12.processPayment(payment25);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str18, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList20);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        Payment payment15 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str16 = payment15.getUserId();
        java.lang.String str17 = payment15.toString();
        boolean boolean18 = dataLayer10.savePayment(payment15);
        java.lang.String str19 = payment15.getDescription();
        java.lang.String str20 = payment15.toString();
        boolean boolean21 = dataLayer0.savePayment(payment15);
        DataLayer dataLayer22 = new DataLayer();
        java.util.List<Payment> paymentList23 = dataLayer22.getAllPayments();
        Payment payment25 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        java.lang.String str34 = payment32.toString();
        boolean boolean35 = dataLayer26.savePayment(payment32);
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        BusinessLayer businessLayer38 = new BusinessLayer(dataLayer36);
        Payment payment40 = businessLayer38.getPaymentDetails("");
        java.util.List<Payment> paymentList41 = businessLayer38.getAllPayments();
        java.util.List<Payment> paymentList42 = businessLayer38.getAllPayments();
        Payment payment47 = new Payment("", "hi!", 0.0d, "");
        businessLayer38.processPayment(payment47);
        boolean boolean49 = dataLayer26.savePayment(payment47);
        DataLayer dataLayer50 = new DataLayer();
        Payment payment55 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str56 = payment55.getUserId();
        java.lang.String str57 = payment55.toString();
        boolean boolean58 = dataLayer50.savePayment(payment55);
        Payment payment60 = dataLayer50.getPaymentById("");
        java.lang.String str61 = payment60.getTransactionId();
        boolean boolean62 = dataLayer26.savePayment(payment60);
        boolean boolean63 = dataLayer22.savePayment(payment60);
        Payment payment65 = dataLayer22.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer66 = new DataLayer();
        java.util.List<Payment> paymentList67 = dataLayer66.getAllPayments();
        BusinessLayer businessLayer68 = new BusinessLayer(dataLayer66);
        Payment payment70 = businessLayer68.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList71 = businessLayer68.getAllPayments();
        Payment payment76 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str77 = payment76.getUserId();
        double double78 = payment76.getAmount();
        java.lang.String str79 = payment76.toString();
        businessLayer68.processPayment(payment76);
        double double81 = payment76.getAmount();
        boolean boolean82 = dataLayer22.savePayment(payment76);
        boolean boolean83 = dataLayer0.savePayment(payment76);
        BusinessLayer businessLayer84 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList85 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList86 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNull(payment25);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str34, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(payment40);
        org.junit.Assert.assertNotNull(paymentList41);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(payment60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(payment65);
        org.junit.Assert.assertNotNull(paymentList67);
        org.junit.Assert.assertNull(payment70);
        org.junit.Assert.assertNotNull(paymentList71);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str79, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(paymentList85);
        org.junit.Assert.assertNotNull(paymentList86);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment13 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str14 = payment13.getUserId();
        java.lang.String str15 = payment13.toString();
        java.lang.String str16 = payment13.toString();
        java.lang.String str17 = payment13.toString();
        boolean boolean18 = dataLayer0.savePayment(payment13);
        java.lang.String str19 = payment13.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str15, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str19, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment17 = businessLayer15.getPaymentDetails("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment19 = businessLayer15.getPaymentDetails("hi!");
        DataLayer dataLayer20 = new DataLayer();
        Payment payment25 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str26 = payment25.getUserId();
        java.lang.String str27 = payment25.toString();
        boolean boolean28 = dataLayer20.savePayment(payment25);
        Payment payment30 = dataLayer20.getPaymentById("");
        BusinessLayer businessLayer31 = new BusinessLayer(dataLayer20);
        Payment payment36 = new Payment("", "hi!", 0.0d, "");
        double double37 = payment36.getAmount();
        java.lang.String str38 = payment36.toString();
        businessLayer31.processPayment(payment36);
        businessLayer15.processPayment(payment36);
        java.lang.String str41 = payment36.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str27, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(payment30);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str38, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        Payment payment4 = new Payment("", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 0.0f, "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer28 = new DataLayer();
        java.util.List<Payment> paymentList29 = dataLayer28.getAllPayments();
        Payment payment31 = dataLayer28.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment36 = new Payment("", "hi!", 0.0d, "");
        double double37 = payment36.getAmount();
        boolean boolean38 = dataLayer28.savePayment(payment36);
        java.lang.String str39 = payment36.toString();
        double double40 = payment36.getAmount();
        java.lang.String str41 = payment36.getDescription();
        boolean boolean42 = dataLayer0.savePayment(payment36);
        java.lang.String str43 = payment36.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paymentList29);
        org.junit.Assert.assertNull(payment31);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str39, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer24 = new DataLayer();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer24.savePayment(payment29);
        Payment payment34 = dataLayer24.getPaymentById("");
        java.lang.String str35 = payment34.getTransactionId();
        boolean boolean36 = dataLayer0.savePayment(payment34);
        java.lang.String str37 = payment34.toString();
        java.lang.String str38 = payment34.getUserId();
        java.lang.String str39 = payment34.getUserId();
        java.lang.String str40 = payment34.toString();
        double double41 = payment34.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(payment34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str37, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str40, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment38 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        Payment payment43 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) ' ', "hi!");
        boolean boolean44 = dataLayer0.savePayment(payment43);
        java.lang.String str45 = payment43.toString();
        java.lang.String str46 = payment43.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(payment38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}" + "'", str45, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}" + "'", str46, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        Payment payment9 = businessLayer2.getPaymentDetails("");
        Payment payment11 = businessLayer2.getPaymentDetails("");
        Payment payment16 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str17 = payment16.getUserId();
        double double18 = payment16.getAmount();
        java.lang.String str19 = payment16.toString();
        java.lang.String str20 = payment16.getDescription();
        java.lang.String str21 = payment16.getDescription();
        java.lang.String str22 = payment16.toString();
        businessLayer2.processPayment(payment16);
        java.lang.String str24 = payment16.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str19, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str22, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str24, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment9 = new Payment("hi!", "", (double) 100.0f, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        businessLayer4.processPayment(payment9);
        java.util.List<Payment> paymentList11 = businessLayer4.getAllPayments();
        Payment payment13 = businessLayer4.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        DataLayer dataLayer14 = new DataLayer();
        java.util.List<Payment> paymentList15 = dataLayer14.getAllPayments();
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer14);
        Payment payment18 = businessLayer16.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList19 = businessLayer16.getAllPayments();
        Payment payment24 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str25 = payment24.getUserId();
        double double26 = payment24.getAmount();
        java.lang.String str27 = payment24.toString();
        businessLayer16.processPayment(payment24);
        DataLayer dataLayer29 = new DataLayer();
        java.util.List<Payment> paymentList30 = dataLayer29.getAllPayments();
        BusinessLayer businessLayer31 = new BusinessLayer(dataLayer29);
        Payment payment33 = businessLayer31.getPaymentDetails("");
        java.util.List<Payment> paymentList34 = businessLayer31.getAllPayments();
        java.util.List<Payment> paymentList35 = businessLayer31.getAllPayments();
        Payment payment40 = new Payment("", "hi!", 0.0d, "");
        businessLayer31.processPayment(payment40);
        Payment payment43 = businessLayer31.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList44 = businessLayer31.getAllPayments();
        java.util.List<Payment> paymentList45 = businessLayer31.getAllPayments();
        Payment payment50 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str51 = payment50.getUserId();
        java.lang.String str52 = payment50.toString();
        java.lang.String str53 = payment50.toString();
        businessLayer31.processPayment(payment50);
        businessLayer16.processPayment(payment50);
        java.lang.String str56 = payment50.getTransactionId();
        businessLayer4.processPayment(payment50);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str27, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList30);
        org.junit.Assert.assertNull(payment33);
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertNotNull(paymentList35);
        org.junit.Assert.assertNull(payment43);
        org.junit.Assert.assertNotNull(paymentList44);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str52, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str53, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment8 = businessLayer2.getPaymentDetails("hi!");
        DataLayer dataLayer9 = new DataLayer();
        java.util.List<Payment> paymentList10 = dataLayer9.getAllPayments();
        Payment payment15 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str16 = payment15.getUserId();
        java.lang.String str17 = payment15.toString();
        boolean boolean18 = dataLayer9.savePayment(payment15);
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        BusinessLayer businessLayer21 = new BusinessLayer(dataLayer19);
        Payment payment23 = businessLayer21.getPaymentDetails("");
        java.util.List<Payment> paymentList24 = businessLayer21.getAllPayments();
        java.util.List<Payment> paymentList25 = businessLayer21.getAllPayments();
        Payment payment30 = new Payment("", "hi!", 0.0d, "");
        businessLayer21.processPayment(payment30);
        boolean boolean32 = dataLayer9.savePayment(payment30);
        DataLayer dataLayer33 = new DataLayer();
        Payment payment38 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str39 = payment38.getUserId();
        java.lang.String str40 = payment38.toString();
        boolean boolean41 = dataLayer33.savePayment(payment38);
        Payment payment43 = dataLayer33.getPaymentById("");
        java.lang.String str44 = payment43.getTransactionId();
        boolean boolean45 = dataLayer9.savePayment(payment43);
        java.lang.String str46 = payment43.toString();
        java.lang.String str47 = payment43.getUserId();
        java.lang.String str48 = payment43.getUserId();
        java.lang.String str49 = payment43.toString();
        java.lang.String str50 = payment43.toString();
        businessLayer2.processPayment(payment43);
        java.util.List<Payment> paymentList52 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNull(payment23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str40, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(payment43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str46, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str49, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str50, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList52);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        BusinessLayer businessLayer37 = new BusinessLayer(dataLayer0);
        Payment payment42 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) (short) 10, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean43 = dataLayer0.savePayment(payment42);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment25 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str26 = payment25.getUserId();
        double double27 = payment25.getAmount();
        java.lang.String str28 = payment25.toString();
        java.lang.String str29 = payment25.getDescription();
        boolean boolean30 = dataLayer0.savePayment(payment25);
        Payment payment35 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str36 = payment35.getDescription();
        java.lang.String str37 = payment35.getTransactionId();
        boolean boolean38 = dataLayer0.savePayment(payment35);
        double double39 = payment35.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str28, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer16);
        Payment payment20 = businessLayer18.getPaymentDetails("");
        java.util.List<Payment> paymentList21 = businessLayer18.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer18.getAllPayments();
        Payment payment27 = new Payment("", "hi!", 0.0d, "");
        businessLayer18.processPayment(payment27);
        java.lang.String str29 = payment27.getDescription();
        businessLayer15.processPayment(payment27);
        DataLayer dataLayer31 = new DataLayer();
        java.util.List<Payment> paymentList32 = dataLayer31.getAllPayments();
        Payment payment34 = dataLayer31.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer35 = new BusinessLayer(dataLayer31);
        Payment payment40 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str41 = payment40.getTransactionId();
        businessLayer35.processPayment(payment40);
        double double43 = payment40.getAmount();
        java.lang.String str44 = payment40.getUserId();
        businessLayer15.processPayment(payment40);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNull(payment34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.lang.Class<?> wildcardClass21 = dataLayer0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer16);
        Payment payment20 = businessLayer18.getPaymentDetails("");
        java.util.List<Payment> paymentList21 = businessLayer18.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer18.getAllPayments();
        Payment payment27 = new Payment("", "hi!", 0.0d, "");
        businessLayer18.processPayment(payment27);
        java.lang.String str29 = payment27.getDescription();
        businessLayer15.processPayment(payment27);
        DataLayer dataLayer31 = new DataLayer();
        java.util.List<Payment> paymentList32 = dataLayer31.getAllPayments();
        Payment payment34 = dataLayer31.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment39 = new Payment("", "hi!", 0.0d, "");
        double double40 = payment39.getAmount();
        boolean boolean41 = dataLayer31.savePayment(payment39);
        java.lang.String str42 = payment39.toString();
        double double43 = payment39.getAmount();
        java.lang.String str44 = payment39.getDescription();
        java.lang.String str45 = payment39.getDescription();
        java.lang.String str46 = payment39.toString();
        businessLayer15.processPayment(payment39);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNull(payment34);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str42, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str46, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment22 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str23 = payment22.getUserId();
        double double24 = payment22.getAmount();
        java.lang.String str25 = payment22.toString();
        businessLayer2.processPayment(payment22);
        Payment payment31 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) (-1L), "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.lang.String str32 = payment31.getUserId();
        java.lang.String str33 = payment31.toString();
        double double34 = payment31.getAmount();
        businessLayer2.processPayment(payment31);
        java.lang.String str36 = payment31.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}" + "'", str33, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str36, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Payment payment4 = new Payment("hi!", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) (byte) 10, "");
        java.lang.String str5 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='hi!', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=10.0, description=''}" + "'", str5, "Payment{transactionId='hi!', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=10.0, description=''}");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        BusinessLayer businessLayer37 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList38 = businessLayer37.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paymentList38);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "hi!", (double) '#', "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean17 = dataLayer0.savePayment(payment16);
        java.lang.String str18 = payment16.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str18, "Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer18.savePayment(payment23);
        Payment payment28 = dataLayer18.getPaymentById("");
        java.lang.String str29 = payment28.getDescription();
        businessLayer2.processPayment(payment28);
        java.lang.Class<?> wildcardClass31 = payment28.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(payment28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        DataLayer dataLayer16 = new DataLayer();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer16.savePayment(payment21);
        Payment payment26 = dataLayer16.getPaymentById("");
        java.lang.String str27 = payment26.getDescription();
        java.lang.String str28 = payment26.getUserId();
        java.lang.String str29 = payment26.getUserId();
        businessLayer2.processPayment(payment26);
        double double31 = payment26.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(payment26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (double) 1, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer28 = new DataLayer();
        java.util.List<Payment> paymentList29 = dataLayer28.getAllPayments();
        Payment payment31 = dataLayer28.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment36 = new Payment("", "hi!", 0.0d, "");
        double double37 = payment36.getAmount();
        boolean boolean38 = dataLayer28.savePayment(payment36);
        java.lang.String str39 = payment36.toString();
        double double40 = payment36.getAmount();
        java.lang.String str41 = payment36.getDescription();
        boolean boolean42 = dataLayer0.savePayment(payment36);
        DataLayer dataLayer43 = new DataLayer();
        java.util.List<Payment> paymentList44 = dataLayer43.getAllPayments();
        java.util.List<Payment> paymentList45 = dataLayer43.getAllPayments();
        Payment payment50 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean51 = dataLayer43.savePayment(payment50);
        Payment payment53 = dataLayer43.getPaymentById("hi!");
        Payment payment58 = new Payment("", "hi!", 0.0d, "");
        boolean boolean59 = dataLayer43.savePayment(payment58);
        Payment payment61 = dataLayer43.getPaymentById("");
        java.lang.String str62 = payment61.toString();
        boolean boolean63 = dataLayer0.savePayment(payment61);
        BusinessLayer businessLayer64 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer65 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paymentList29);
        org.junit.Assert.assertNull(payment31);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str39, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paymentList44);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(payment53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(payment61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str62, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        Payment payment7 = dataLayer4.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment12 = new Payment("", "hi!", 0.0d, "");
        double double13 = payment12.getAmount();
        boolean boolean14 = dataLayer4.savePayment(payment12);
        java.lang.String str15 = payment12.toString();
        double double16 = payment12.getAmount();
        java.lang.String str17 = payment12.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment12);
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        Payment payment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dataLayer0.savePayment(payment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str15, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(payment20);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("hi!", "", (-1.0d), "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        businessLayer11.processPayment(payment16);
        java.lang.String str18 = payment16.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (-1), "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList18 = businessLayer2.getAllPayments();
        Payment payment20 = businessLayer2.getPaymentDetails("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertNull(payment20);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        DataLayer dataLayer24 = new DataLayer();
        java.util.List<Payment> paymentList25 = dataLayer24.getAllPayments();
        java.util.List<Payment> paymentList26 = dataLayer24.getAllPayments();
        Payment payment28 = dataLayer24.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.util.List<Payment> paymentList29 = dataLayer24.getAllPayments();
        java.util.List<Payment> paymentList30 = dataLayer24.getAllPayments();
        DataLayer dataLayer31 = new DataLayer();
        java.util.List<Payment> paymentList32 = dataLayer31.getAllPayments();
        BusinessLayer businessLayer33 = new BusinessLayer(dataLayer31);
        DataLayer dataLayer34 = new DataLayer();
        java.util.List<Payment> paymentList35 = dataLayer34.getAllPayments();
        Payment payment40 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str41 = payment40.getUserId();
        java.lang.String str42 = payment40.toString();
        boolean boolean43 = dataLayer34.savePayment(payment40);
        java.lang.String str44 = payment40.getTransactionId();
        double double45 = payment40.getAmount();
        businessLayer33.processPayment(payment40);
        java.util.List<Payment> paymentList47 = businessLayer33.getAllPayments();
        java.util.List<Payment> paymentList48 = businessLayer33.getAllPayments();
        Payment payment53 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer33.processPayment(payment53);
        boolean boolean55 = dataLayer24.savePayment(payment53);
        java.lang.String str56 = payment53.getDescription();
        java.lang.String str57 = payment53.getUserId();
        boolean boolean58 = dataLayer0.savePayment(payment53);
        Payment payment60 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertNotNull(paymentList26);
        org.junit.Assert.assertNull(payment28);
        org.junit.Assert.assertNotNull(paymentList29);
        org.junit.Assert.assertNotNull(paymentList30);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNotNull(paymentList35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str42, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList47);
        org.junit.Assert.assertNotNull(paymentList48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str57, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(payment60);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(payment11);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        Payment payment11 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment11);
        Payment payment14 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList15 = businessLayer2.getAllPayments();
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        java.util.List<Payment> paymentList18 = dataLayer16.getAllPayments();
        Payment payment20 = dataLayer16.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer21 = new DataLayer();
        Payment payment26 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str27 = payment26.getUserId();
        java.lang.String str28 = payment26.toString();
        boolean boolean29 = dataLayer21.savePayment(payment26);
        boolean boolean30 = dataLayer16.savePayment(payment26);
        DataLayer dataLayer31 = new DataLayer();
        java.util.List<Payment> paymentList32 = dataLayer31.getAllPayments();
        Payment payment37 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str38 = payment37.getUserId();
        java.lang.String str39 = payment37.toString();
        boolean boolean40 = dataLayer31.savePayment(payment37);
        double double41 = payment37.getAmount();
        java.lang.String str42 = payment37.getUserId();
        boolean boolean43 = dataLayer16.savePayment(payment37);
        Payment payment48 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str49 = payment48.getUserId();
        double double50 = payment48.getAmount();
        java.lang.String str51 = payment48.toString();
        boolean boolean52 = dataLayer16.savePayment(payment48);
        Payment payment57 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str58 = payment57.getUserId();
        java.lang.String str59 = payment57.getDescription();
        boolean boolean60 = dataLayer16.savePayment(payment57);
        businessLayer2.processPayment(payment57);
        Payment payment63 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        java.util.List<Payment> paymentList64 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str28, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str39, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str51, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str58, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str59, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(payment63);
        org.junit.Assert.assertNotNull(paymentList64);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        DataLayer dataLayer5 = new DataLayer();
        java.util.List<Payment> paymentList6 = dataLayer5.getAllPayments();
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer5);
        Payment payment9 = businessLayer7.getPaymentDetails("");
        java.util.List<Payment> paymentList10 = businessLayer7.getAllPayments();
        java.util.List<Payment> paymentList11 = businessLayer7.getAllPayments();
        Payment payment16 = new Payment("", "hi!", 0.0d, "");
        businessLayer7.processPayment(payment16);
        Payment payment19 = businessLayer7.getPaymentDetails("");
        java.lang.String str20 = payment19.getUserId();
        businessLayer2.processPayment(payment19);
        java.lang.String str22 = payment19.getUserId();
        double double23 = payment19.getAmount();
        java.lang.String str24 = payment19.getDescription();
        java.lang.String str25 = payment19.getTransactionId();
        java.lang.String str26 = payment19.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(payment19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        java.util.List<Payment> paymentList17 = dataLayer0.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer18);
        Payment payment22 = businessLayer20.getPaymentDetails("");
        java.util.List<Payment> paymentList23 = businessLayer20.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer20.getAllPayments();
        Payment payment29 = new Payment("", "hi!", 0.0d, "");
        businessLayer20.processPayment(payment29);
        Payment payment32 = businessLayer20.getPaymentDetails("");
        boolean boolean33 = dataLayer0.savePayment(payment32);
        java.util.List<Payment> paymentList34 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer35 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer36 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(payment32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paymentList34);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        DataLayer dataLayer5 = new DataLayer();
        java.util.List<Payment> paymentList6 = dataLayer5.getAllPayments();
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer5);
        DataLayer dataLayer8 = new DataLayer();
        java.util.List<Payment> paymentList9 = dataLayer8.getAllPayments();
        Payment payment14 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str15 = payment14.getUserId();
        java.lang.String str16 = payment14.toString();
        boolean boolean17 = dataLayer8.savePayment(payment14);
        java.lang.String str18 = payment14.getTransactionId();
        double double19 = payment14.getAmount();
        businessLayer7.processPayment(payment14);
        java.util.List<Payment> paymentList21 = businessLayer7.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer7.getAllPayments();
        DataLayer dataLayer23 = new DataLayer();
        Payment payment28 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str29 = payment28.getUserId();
        java.lang.String str30 = payment28.toString();
        boolean boolean31 = dataLayer23.savePayment(payment28);
        Payment payment33 = dataLayer23.getPaymentById("");
        java.lang.String str34 = payment33.getDescription();
        businessLayer7.processPayment(payment33);
        businessLayer2.processPayment(payment33);
        Payment payment38 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList39 = businessLayer2.getAllPayments();
        Payment payment41 = businessLayer2.getPaymentDetails("");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str30, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(payment33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(payment38);
        org.junit.Assert.assertNotNull(paymentList39);
        org.junit.Assert.assertNotNull(payment41);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) '4', "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer5 = new DataLayer();
        java.util.List<Payment> paymentList6 = dataLayer5.getAllPayments();
        BusinessLayer businessLayer7 = new BusinessLayer(dataLayer5);
        DataLayer dataLayer8 = new DataLayer();
        java.util.List<Payment> paymentList9 = dataLayer8.getAllPayments();
        Payment payment14 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str15 = payment14.getUserId();
        java.lang.String str16 = payment14.toString();
        boolean boolean17 = dataLayer8.savePayment(payment14);
        java.lang.String str18 = payment14.getTransactionId();
        double double19 = payment14.getAmount();
        businessLayer7.processPayment(payment14);
        Payment payment22 = businessLayer7.getPaymentDetails("");
        DataLayer dataLayer23 = new DataLayer();
        java.util.List<Payment> paymentList24 = dataLayer23.getAllPayments();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer23.savePayment(payment29);
        DataLayer dataLayer33 = new DataLayer();
        java.util.List<Payment> paymentList34 = dataLayer33.getAllPayments();
        BusinessLayer businessLayer35 = new BusinessLayer(dataLayer33);
        Payment payment37 = businessLayer35.getPaymentDetails("");
        java.util.List<Payment> paymentList38 = businessLayer35.getAllPayments();
        java.util.List<Payment> paymentList39 = businessLayer35.getAllPayments();
        Payment payment44 = new Payment("", "hi!", 0.0d, "");
        businessLayer35.processPayment(payment44);
        boolean boolean46 = dataLayer23.savePayment(payment44);
        DataLayer dataLayer47 = new DataLayer();
        Payment payment52 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str53 = payment52.getUserId();
        java.lang.String str54 = payment52.toString();
        boolean boolean55 = dataLayer47.savePayment(payment52);
        Payment payment57 = dataLayer47.getPaymentById("");
        java.lang.String str58 = payment57.getTransactionId();
        boolean boolean59 = dataLayer23.savePayment(payment57);
        businessLayer7.processPayment(payment57);
        Payment payment62 = businessLayer7.getPaymentDetails("hi!");
        DataLayer dataLayer63 = new DataLayer();
        Payment payment68 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str69 = payment68.getUserId();
        java.lang.String str70 = payment68.toString();
        boolean boolean71 = dataLayer63.savePayment(payment68);
        Payment payment76 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str77 = payment76.getDescription();
        java.lang.String str78 = payment76.getTransactionId();
        boolean boolean79 = dataLayer63.savePayment(payment76);
        BusinessLayer businessLayer80 = new BusinessLayer(dataLayer63);
        DataLayer dataLayer81 = new DataLayer();
        Payment payment86 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str87 = payment86.getUserId();
        java.lang.String str88 = payment86.toString();
        boolean boolean89 = dataLayer81.savePayment(payment86);
        java.lang.String str90 = payment86.getDescription();
        boolean boolean91 = dataLayer63.savePayment(payment86);
        businessLayer7.processPayment(payment86);
        boolean boolean93 = dataLayer0.savePayment(payment86);
        BusinessLayer businessLayer94 = new BusinessLayer(dataLayer0);
        Payment payment96 = businessLayer94.getPaymentDetails("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(payment22);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertNull(payment37);
        org.junit.Assert.assertNotNull(paymentList38);
        org.junit.Assert.assertNotNull(paymentList39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str54, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(payment57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(payment62);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str70, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str88, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(payment96);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        Payment payment20 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer21 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer22 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList23 = dataLayer0.getAllPayments();
        Payment payment25 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNull(payment25);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNull(payment13);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) '#', "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList5 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer15.savePayment(payment21);
        double double25 = payment21.getAmount();
        java.lang.String str26 = payment21.getUserId();
        boolean boolean27 = dataLayer0.savePayment(payment21);
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        double double34 = payment32.getAmount();
        java.lang.String str35 = payment32.toString();
        boolean boolean36 = dataLayer0.savePayment(payment32);
        Payment payment41 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.getDescription();
        boolean boolean44 = dataLayer0.savePayment(payment41);
        java.util.List<Payment> paymentList45 = dataLayer0.getAllPayments();
        Payment payment47 = dataLayer0.getPaymentById("Payment{transactionId='hi!', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=10.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str42, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertNull(payment47);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        java.util.List<Payment> paymentList6 = dataLayer4.getAllPayments();
        Payment payment8 = dataLayer4.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer9 = new DataLayer();
        Payment payment14 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str15 = payment14.getUserId();
        java.lang.String str16 = payment14.toString();
        boolean boolean17 = dataLayer9.savePayment(payment14);
        boolean boolean18 = dataLayer4.savePayment(payment14);
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        Payment payment25 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str26 = payment25.getUserId();
        java.lang.String str27 = payment25.toString();
        boolean boolean28 = dataLayer19.savePayment(payment25);
        double double29 = payment25.getAmount();
        java.lang.String str30 = payment25.getUserId();
        boolean boolean31 = dataLayer4.savePayment(payment25);
        java.lang.String str32 = payment25.getTransactionId();
        boolean boolean33 = dataLayer0.savePayment(payment25);
        Payment payment35 = dataLayer0.getPaymentById("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str27, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(payment35);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        Payment payment17 = businessLayer2.getPaymentDetails("");
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        Payment payment24 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str25 = payment24.getUserId();
        java.lang.String str26 = payment24.toString();
        boolean boolean27 = dataLayer18.savePayment(payment24);
        DataLayer dataLayer28 = new DataLayer();
        java.util.List<Payment> paymentList29 = dataLayer28.getAllPayments();
        BusinessLayer businessLayer30 = new BusinessLayer(dataLayer28);
        Payment payment32 = businessLayer30.getPaymentDetails("");
        java.util.List<Payment> paymentList33 = businessLayer30.getAllPayments();
        java.util.List<Payment> paymentList34 = businessLayer30.getAllPayments();
        Payment payment39 = new Payment("", "hi!", 0.0d, "");
        businessLayer30.processPayment(payment39);
        boolean boolean41 = dataLayer18.savePayment(payment39);
        DataLayer dataLayer42 = new DataLayer();
        Payment payment47 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str48 = payment47.getUserId();
        java.lang.String str49 = payment47.toString();
        boolean boolean50 = dataLayer42.savePayment(payment47);
        Payment payment52 = dataLayer42.getPaymentById("");
        java.lang.String str53 = payment52.getTransactionId();
        boolean boolean54 = dataLayer18.savePayment(payment52);
        businessLayer2.processPayment(payment52);
        Payment payment57 = businessLayer2.getPaymentDetails("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass58 = payment57.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(payment17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str26, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentList29);
        org.junit.Assert.assertNull(payment32);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str49, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(payment52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(payment57);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer15);
        Payment payment19 = businessLayer17.getPaymentDetails("");
        java.util.List<Payment> paymentList20 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList21 = businessLayer17.getAllPayments();
        Payment payment26 = new Payment("", "hi!", 0.0d, "");
        businessLayer17.processPayment(payment26);
        Payment payment29 = businessLayer17.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList30 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList31 = businessLayer17.getAllPayments();
        Payment payment36 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str37 = payment36.getUserId();
        java.lang.String str38 = payment36.toString();
        java.lang.String str39 = payment36.toString();
        businessLayer17.processPayment(payment36);
        businessLayer2.processPayment(payment36);
        java.lang.String str42 = payment36.getDescription();
        java.lang.String str43 = payment36.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNull(payment29);
        org.junit.Assert.assertNotNull(paymentList30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str38, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str39, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) ' ', "hi!");
        double double5 = payment4.getAmount();
        java.lang.String str6 = payment4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}" + "'", str6, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("", "hi!", 0.0d, "");
        double double17 = payment16.getAmount();
        java.lang.String str18 = payment16.toString();
        businessLayer11.processPayment(payment16);
        java.lang.Class<?> wildcardClass20 = businessLayer11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str18, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("hi!");
        Payment payment16 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str17 = payment16.getUserId();
        double double18 = payment16.getAmount();
        java.lang.String str19 = payment16.getUserId();
        java.lang.String str20 = payment16.getTransactionId();
        java.lang.String str21 = payment16.getUserId();
        boolean boolean22 = dataLayer0.savePayment(payment16);
        double double23 = payment16.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment14 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        Payment payment18 = dataLayer15.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment23 = new Payment("", "hi!", 0.0d, "");
        double double24 = payment23.getAmount();
        boolean boolean25 = dataLayer15.savePayment(payment23);
        java.lang.String str26 = payment23.toString();
        double double27 = payment23.getAmount();
        java.lang.String str28 = payment23.getDescription();
        boolean boolean29 = dataLayer0.savePayment(payment23);
        Payment payment31 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        Payment payment33 = dataLayer0.getPaymentById("");
        java.lang.String str34 = payment33.getTransactionId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment18);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str26, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(payment31);
        org.junit.Assert.assertNotNull(payment33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment13 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str14 = payment13.getUserId();
        java.lang.String str15 = payment13.toString();
        java.lang.String str16 = payment13.toString();
        java.lang.String str17 = payment13.toString();
        boolean boolean18 = dataLayer0.savePayment(payment13);
        double double19 = payment13.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str15, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.getUserId();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.getUserId();
        java.lang.String str8 = payment4.toString();
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        java.util.List<Payment> paymentList17 = dataLayer15.getAllPayments();
        Payment payment19 = dataLayer15.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer20 = new DataLayer();
        Payment payment25 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str26 = payment25.getUserId();
        java.lang.String str27 = payment25.toString();
        boolean boolean28 = dataLayer20.savePayment(payment25);
        boolean boolean29 = dataLayer15.savePayment(payment25);
        java.lang.String str30 = payment25.getUserId();
        java.lang.String str31 = payment25.getDescription();
        java.lang.String str32 = payment25.getTransactionId();
        businessLayer2.processPayment(payment25);
        Payment payment35 = businessLayer2.getPaymentDetails("Payment{transactionId='hi!', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=10.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str27, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(payment35);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 100.0f, "Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        Payment payment18 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer19 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer0);
        Payment payment22 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertNull(payment22);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList3 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList4 = businessLayer2.getAllPayments();
        Payment payment9 = new Payment("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "", (double) 10, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
        businessLayer2.processPayment(payment9);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean17 = dataLayer0.savePayment(payment16);
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        boolean boolean16 = dataLayer0.savePayment(payment15);
        Payment payment18 = dataLayer0.getPaymentById("");
        java.lang.String str19 = payment18.toString();
        java.lang.String str20 = payment18.getUserId();
        java.lang.String str21 = payment18.getTransactionId();
        java.lang.String str22 = payment18.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str19, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment7 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment7);
        java.util.List<Payment> paymentList9 = businessLayer2.getAllPayments();
        Payment payment11 = businessLayer2.getPaymentDetails("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        java.lang.String str17 = payment15.getDescription();
        boolean boolean18 = dataLayer0.savePayment(payment15);
        java.lang.String str19 = payment15.toString();
        java.lang.String str20 = payment15.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str19, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str20, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList8 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList9 = businessLayer2.getAllPayments();
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("hi!");
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer15);
        Payment payment19 = businessLayer17.getPaymentDetails("");
        java.util.List<Payment> paymentList20 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList21 = businessLayer17.getAllPayments();
        Payment payment26 = new Payment("", "hi!", 0.0d, "");
        businessLayer17.processPayment(payment26);
        Payment payment29 = businessLayer17.getPaymentDetails("");
        java.lang.String str30 = payment29.getUserId();
        businessLayer12.processPayment(payment29);
        businessLayer2.processPayment(payment29);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(payment29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        DataLayer dataLayer2 = new DataLayer();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str8 = payment7.getUserId();
        java.lang.String str9 = payment7.toString();
        boolean boolean10 = dataLayer2.savePayment(payment7);
        Payment payment12 = dataLayer2.getPaymentById("");
        BusinessLayer businessLayer13 = new BusinessLayer(dataLayer2);
        Payment payment18 = new Payment("", "hi!", 0.0d, "");
        double double19 = payment18.getAmount();
        java.lang.String str20 = payment18.toString();
        businessLayer13.processPayment(payment18);
        boolean boolean22 = dataLayer0.savePayment(payment18);
        java.lang.String str23 = payment18.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str9, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(payment12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str20, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) (-1L), "Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}", "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", 10.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        Payment payment22 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer2.processPayment(payment22);
        Payment payment25 = businessLayer2.getPaymentDetails("");
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        java.lang.String str34 = payment32.toString();
        boolean boolean35 = dataLayer26.savePayment(payment32);
        java.lang.String str36 = payment32.getDescription();
        java.lang.String str37 = payment32.getDescription();
        java.lang.String str38 = payment32.getTransactionId();
        businessLayer2.processPayment(payment32);
        java.lang.String str40 = payment32.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNotNull(payment25);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str34, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        double double12 = payment10.getAmount();
        java.lang.String str13 = payment10.toString();
        businessLayer2.processPayment(payment10);
        DataLayer dataLayer15 = new DataLayer();
        java.util.List<Payment> paymentList16 = dataLayer15.getAllPayments();
        BusinessLayer businessLayer17 = new BusinessLayer(dataLayer15);
        Payment payment19 = businessLayer17.getPaymentDetails("");
        java.util.List<Payment> paymentList20 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList21 = businessLayer17.getAllPayments();
        Payment payment26 = new Payment("", "hi!", 0.0d, "");
        businessLayer17.processPayment(payment26);
        Payment payment29 = businessLayer17.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList30 = businessLayer17.getAllPayments();
        java.util.List<Payment> paymentList31 = businessLayer17.getAllPayments();
        Payment payment36 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str37 = payment36.getUserId();
        java.lang.String str38 = payment36.toString();
        java.lang.String str39 = payment36.toString();
        businessLayer17.processPayment(payment36);
        businessLayer2.processPayment(payment36);
        java.util.List<Payment> paymentList42 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList43 = businessLayer2.getAllPayments();
        java.lang.Class<?> wildcardClass44 = businessLayer2.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(payment19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNull(payment29);
        org.junit.Assert.assertNotNull(paymentList30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str38, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str39, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertNotNull(paymentList43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (double) '4', "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.lang.String str9 = payment7.getDescription();
        java.lang.String str10 = payment7.getUserId();
        double double11 = payment7.getAmount();
        java.lang.String str12 = payment7.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (short) -1, "Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        Payment payment17 = businessLayer2.getPaymentDetails("");
        DataLayer dataLayer18 = new DataLayer();
        java.util.List<Payment> paymentList19 = dataLayer18.getAllPayments();
        Payment payment24 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str25 = payment24.getUserId();
        java.lang.String str26 = payment24.toString();
        boolean boolean27 = dataLayer18.savePayment(payment24);
        DataLayer dataLayer28 = new DataLayer();
        java.util.List<Payment> paymentList29 = dataLayer28.getAllPayments();
        BusinessLayer businessLayer30 = new BusinessLayer(dataLayer28);
        Payment payment32 = businessLayer30.getPaymentDetails("");
        java.util.List<Payment> paymentList33 = businessLayer30.getAllPayments();
        java.util.List<Payment> paymentList34 = businessLayer30.getAllPayments();
        Payment payment39 = new Payment("", "hi!", 0.0d, "");
        businessLayer30.processPayment(payment39);
        boolean boolean41 = dataLayer18.savePayment(payment39);
        DataLayer dataLayer42 = new DataLayer();
        Payment payment47 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str48 = payment47.getUserId();
        java.lang.String str49 = payment47.toString();
        boolean boolean50 = dataLayer42.savePayment(payment47);
        Payment payment52 = dataLayer42.getPaymentById("");
        java.lang.String str53 = payment52.getTransactionId();
        boolean boolean54 = dataLayer18.savePayment(payment52);
        businessLayer2.processPayment(payment52);
        Payment payment57 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        Payment payment59 = businessLayer2.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass60 = payment59.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(payment17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str26, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentList29);
        org.junit.Assert.assertNull(payment32);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str49, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(payment52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(payment57);
        org.junit.Assert.assertNull(payment59);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        DataLayer dataLayer10 = new DataLayer();
        java.util.List<Payment> paymentList11 = dataLayer10.getAllPayments();
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer10);
        Payment payment14 = businessLayer12.getPaymentDetails("");
        java.util.List<Payment> paymentList15 = businessLayer12.getAllPayments();
        java.util.List<Payment> paymentList16 = businessLayer12.getAllPayments();
        Payment payment21 = new Payment("", "hi!", 0.0d, "");
        businessLayer12.processPayment(payment21);
        boolean boolean23 = dataLayer0.savePayment(payment21);
        double double24 = payment21.getAmount();
        double double25 = payment21.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment4 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer5 = new DataLayer();
        Payment payment10 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.toString();
        boolean boolean13 = dataLayer5.savePayment(payment10);
        boolean boolean14 = dataLayer0.savePayment(payment10);
        BusinessLayer businessLayer15 = new BusinessLayer(dataLayer0);
        Payment payment17 = businessLayer15.getPaymentDetails("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        java.lang.Class<?> wildcardClass18 = businessLayer15.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("hi!");
        DataLayer dataLayer9 = new DataLayer();
        java.util.List<Payment> paymentList10 = dataLayer9.getAllPayments();
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer9);
        Payment payment13 = businessLayer11.getPaymentDetails("");
        java.util.List<Payment> paymentList14 = businessLayer11.getAllPayments();
        java.util.List<Payment> paymentList15 = businessLayer11.getAllPayments();
        Payment payment20 = new Payment("", "hi!", 0.0d, "");
        businessLayer11.processPayment(payment20);
        Payment payment23 = businessLayer11.getPaymentDetails("");
        java.lang.String str24 = payment23.getUserId();
        businessLayer6.processPayment(payment23);
        businessLayer3.processPayment(payment23);
        Payment payment31 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", 1.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        java.lang.String str32 = payment31.getUserId();
        businessLayer3.processPayment(payment31);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertNotNull(paymentList14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(payment23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str32, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList12 = businessLayer11.getAllPayments();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertNotNull(paymentList12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "", 0.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        java.lang.String str5 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer3 = new DataLayer();
        java.util.List<Payment> paymentList4 = dataLayer3.getAllPayments();
        Payment payment9 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str10 = payment9.getUserId();
        java.lang.String str11 = payment9.toString();
        boolean boolean12 = dataLayer3.savePayment(payment9);
        java.lang.String str13 = payment9.getTransactionId();
        double double14 = payment9.getAmount();
        businessLayer2.processPayment(payment9);
        java.util.List<Payment> paymentList16 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList17 = businessLayer2.getAllPayments();
        DataLayer dataLayer18 = new DataLayer();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer18.savePayment(payment23);
        Payment payment28 = dataLayer18.getPaymentById("");
        java.lang.String str29 = payment28.getDescription();
        businessLayer2.processPayment(payment28);
        double double31 = payment28.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(payment28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        Payment payment4 = new Payment("", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (-1.0d), "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        Payment payment17 = new Payment("hi!", "hi!", 10.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean18 = dataLayer0.savePayment(payment17);
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        Payment payment22 = dataLayer19.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment27 = new Payment("", "hi!", 0.0d, "");
        double double28 = payment27.getAmount();
        boolean boolean29 = dataLayer19.savePayment(payment27);
        java.lang.String str30 = payment27.toString();
        java.lang.String str31 = payment27.getDescription();
        boolean boolean32 = dataLayer0.savePayment(payment27);
        java.lang.String str33 = payment27.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str30, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }
}

