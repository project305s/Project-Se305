import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
        DataLayer dataLayer17 = new DataLayer();
        java.util.List<Payment> paymentList18 = dataLayer17.getAllPayments();
        Payment payment23 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str24 = payment23.getUserId();
        java.lang.String str25 = payment23.toString();
        boolean boolean26 = dataLayer17.savePayment(payment23);
        BusinessLayer businessLayer27 = new BusinessLayer(dataLayer17);
        java.util.List<Payment> paymentList28 = dataLayer17.getAllPayments();
        Payment payment30 = dataLayer17.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        DataLayer dataLayer31 = new DataLayer();
        java.util.List<Payment> paymentList32 = dataLayer31.getAllPayments();
        java.util.List<Payment> paymentList33 = dataLayer31.getAllPayments();
        Payment payment35 = dataLayer31.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer36 = new DataLayer();
        Payment payment41 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.toString();
        boolean boolean44 = dataLayer36.savePayment(payment41);
        boolean boolean45 = dataLayer31.savePayment(payment41);
        DataLayer dataLayer46 = new DataLayer();
        java.util.List<Payment> paymentList47 = dataLayer46.getAllPayments();
        Payment payment52 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str53 = payment52.getUserId();
        java.lang.String str54 = payment52.toString();
        boolean boolean55 = dataLayer46.savePayment(payment52);
        double double56 = payment52.getAmount();
        java.lang.String str57 = payment52.getUserId();
        boolean boolean58 = dataLayer31.savePayment(payment52);
        Payment payment63 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str64 = payment63.getUserId();
        double double65 = payment63.getAmount();
        java.lang.String str66 = payment63.toString();
        boolean boolean67 = dataLayer31.savePayment(payment63);
        BusinessLayer businessLayer68 = new BusinessLayer(dataLayer31);
        Payment payment73 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) (short) 10, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean74 = dataLayer31.savePayment(payment73);
        java.lang.String str75 = payment73.getTransactionId();
        boolean boolean76 = dataLayer17.savePayment(payment73);
        businessLayer16.processPayment(payment73);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paymentList28);
        org.junit.Assert.assertNull(payment30);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNull(payment35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentList47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str54, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str66, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str75, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList13 = dataLayer0.getAllPayments();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList13);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        java.lang.String str15 = payment11.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment9 = new Payment("hi!", "", (double) 100.0f, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        businessLayer4.processPayment(payment9);
        Payment payment12 = businessLayer4.getPaymentDetails("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNull(payment12);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        double double21 = payment15.getAmount();
        java.lang.String str22 = payment15.getUserId();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        double double62 = payment54.getAmount();
        java.lang.String str63 = payment54.toString();
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
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str63, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        Payment payment42 = businessLayer15.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        java.util.List<Payment> paymentList43 = businessLayer15.getAllPayments();
        Payment payment48 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", (double) '4', "");
        businessLayer15.processPayment(payment48);
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
        org.junit.Assert.assertNotNull(paymentList43);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        java.lang.String str62 = payment54.getUserId();
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        Payment payment19 = businessLayer17.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(payment19);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        java.lang.String str20 = payment16.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str19, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str20, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        Payment payment4 = new Payment("Payment{transactionId='hi!', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=10.0, description=''}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) 100, "Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer4 = new DataLayer();
        java.util.List<Payment> paymentList5 = dataLayer4.getAllPayments();
        BusinessLayer businessLayer6 = new BusinessLayer(dataLayer4);
        Payment payment8 = businessLayer6.getPaymentDetails("");
        java.util.List<Payment> paymentList9 = businessLayer6.getAllPayments();
        java.util.List<Payment> paymentList10 = businessLayer6.getAllPayments();
        Payment payment15 = new Payment("", "hi!", 0.0d, "");
        businessLayer6.processPayment(payment15);
        Payment payment18 = businessLayer6.getPaymentDetails("");
        java.lang.String str19 = payment18.getDescription();
        businessLayer3.processPayment(payment18);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        DataLayer dataLayer30 = new DataLayer();
        java.util.List<Payment> paymentList31 = dataLayer30.getAllPayments();
        java.util.List<Payment> paymentList32 = dataLayer30.getAllPayments();
        Payment payment37 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean38 = dataLayer30.savePayment(payment37);
        double double39 = payment37.getAmount();
        java.lang.String str40 = payment37.getUserId();
        java.lang.String str41 = payment37.getTransactionId();
        java.lang.String str42 = payment37.toString();
        java.lang.String str43 = payment37.getUserId();
        boolean boolean44 = dataLayer0.savePayment(payment37);
        java.lang.String str45 = payment37.toString();
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
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str42, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str45, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        java.lang.Class<?> wildcardClass32 = paymentList31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        Payment payment44 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
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
        org.junit.Assert.assertNull(payment44);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer15 = new DataLayer();
        Payment payment20 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str21 = payment20.getUserId();
        java.lang.String str22 = payment20.toString();
        boolean boolean23 = dataLayer15.savePayment(payment20);
        Payment payment28 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str29 = payment28.getUserId();
        java.lang.String str30 = payment28.toString();
        java.lang.String str31 = payment28.toString();
        java.lang.String str32 = payment28.toString();
        boolean boolean33 = dataLayer15.savePayment(payment28);
        boolean boolean34 = dataLayer0.savePayment(payment28);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str22, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str30, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str32, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        double double75 = payment69.getAmount();
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList10 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList12 = businessLayer11.getAllPayments();
        java.lang.Class<?> wildcardClass13 = businessLayer11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
        java.util.List<Payment> paymentList36 = businessLayer2.getAllPayments();
        Payment payment38 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
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
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertNull(payment38);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        java.lang.String str23 = payment19.toString();
        java.lang.String str24 = payment19.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str20, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str23, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str24, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        double double44 = payment36.getAmount();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        DataLayer dataLayer20 = new DataLayer();
        java.util.List<Payment> paymentList21 = dataLayer20.getAllPayments();
        java.util.List<Payment> paymentList22 = dataLayer20.getAllPayments();
        Payment payment24 = dataLayer20.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer25 = new DataLayer();
        Payment payment30 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str31 = payment30.getUserId();
        java.lang.String str32 = payment30.toString();
        boolean boolean33 = dataLayer25.savePayment(payment30);
        boolean boolean34 = dataLayer20.savePayment(payment30);
        DataLayer dataLayer35 = new DataLayer();
        java.util.List<Payment> paymentList36 = dataLayer35.getAllPayments();
        Payment payment41 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.toString();
        boolean boolean44 = dataLayer35.savePayment(payment41);
        double double45 = payment41.getAmount();
        java.lang.String str46 = payment41.getUserId();
        boolean boolean47 = dataLayer20.savePayment(payment41);
        Payment payment52 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str53 = payment52.getUserId();
        double double54 = payment52.getAmount();
        java.lang.String str55 = payment52.toString();
        boolean boolean56 = dataLayer20.savePayment(payment52);
        Payment payment58 = dataLayer20.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        Payment payment63 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "hi!", (double) ' ', "hi!");
        boolean boolean64 = dataLayer20.savePayment(payment63);
        java.lang.String str65 = payment63.toString();
        businessLayer12.processPayment(payment63);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str18, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertNull(payment24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str32, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str55, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(payment58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}" + "'", str65, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        java.util.List<Payment> paymentList20 = businessLayer15.getAllPayments();
        java.util.List<Payment> paymentList21 = businessLayer15.getAllPayments();
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
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        Payment payment33 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = payment33.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(payment33);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        Payment payment4 = new Payment("Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}", (double) 100.0f, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str5, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment16 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean17 = dataLayer0.savePayment(payment16);
        java.lang.String str18 = payment16.getTransactionId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str18, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        Payment payment50 = dataLayer0.getPaymentById("Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
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
        org.junit.Assert.assertNull(payment50);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("");
        java.lang.String str12 = payment11.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(payment11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        Payment payment4 = new Payment("Payment{transactionId='hi!', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=10.0, description=''}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}", (double) 10L, "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}'}");
        java.lang.String str5 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}'}");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        Payment payment21 = dataLayer0.getPaymentById("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(payment21);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.lang.String str9 = payment7.getDescription();
        double double10 = payment7.getAmount();
        java.lang.String str11 = payment7.toString();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}", "hi!", (double) '#', "Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=10.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        java.lang.String str86 = payment85.getDescription();
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
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.getDescription();
        java.lang.String str9 = payment4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        java.util.List<Payment> paymentList19 = businessLayer18.getAllPayments();
        Payment payment21 = businessLayer18.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment21);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        Payment payment24 = new Payment("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 10L, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean25 = dataLayer0.savePayment(payment24);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment13 = businessLayer11.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment13);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        java.util.List<Payment> paymentList41 = dataLayer0.getAllPayments();
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
        org.junit.Assert.assertNotNull(paymentList41);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        java.util.List<Payment> paymentList12 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(paymentList12);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        BusinessLayer businessLayer79 = new BusinessLayer(dataLayer0);
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
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        java.lang.String str32 = payment27.getDescription();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment7 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment7);
        Payment payment10 = businessLayer2.getPaymentDetails("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        DataLayer dataLayer11 = new DataLayer();
        java.util.List<Payment> paymentList12 = dataLayer11.getAllPayments();
        java.util.List<Payment> paymentList13 = dataLayer11.getAllPayments();
        Payment payment15 = dataLayer11.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer16 = new DataLayer();
        Payment payment21 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str22 = payment21.getUserId();
        java.lang.String str23 = payment21.toString();
        boolean boolean24 = dataLayer16.savePayment(payment21);
        boolean boolean25 = dataLayer11.savePayment(payment21);
        java.lang.String str26 = payment21.toString();
        businessLayer2.processPayment(payment21);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNull(payment15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str23, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str26, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer0);
        Payment payment12 = businessLayer10.getPaymentDetails("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        java.lang.Class<?> wildcardClass13 = businessLayer10.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        BusinessLayer businessLayer21 = new BusinessLayer(dataLayer19);
        Payment payment23 = businessLayer21.getPaymentDetails("");
        java.util.List<Payment> paymentList24 = businessLayer21.getAllPayments();
        java.util.List<Payment> paymentList25 = businessLayer21.getAllPayments();
        java.util.List<Payment> paymentList26 = businessLayer21.getAllPayments();
        Payment payment28 = businessLayer21.getPaymentDetails("");
        Payment payment30 = businessLayer21.getPaymentDetails("");
        Payment payment35 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str36 = payment35.getUserId();
        double double37 = payment35.getAmount();
        java.lang.String str38 = payment35.toString();
        java.lang.String str39 = payment35.getDescription();
        java.lang.String str40 = payment35.getDescription();
        java.lang.String str41 = payment35.toString();
        businessLayer21.processPayment(payment35);
        boolean boolean43 = dataLayer0.savePayment(payment35);
        Payment payment45 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNull(payment23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertNotNull(paymentList26);
        org.junit.Assert.assertNull(payment28);
        org.junit.Assert.assertNull(payment30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str38, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str41, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(payment45);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        java.lang.String str30 = payment24.getTransactionId();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment6 = dataLayer0.getPaymentById("");
        Payment payment8 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer0);
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        DataLayer dataLayer12 = new DataLayer();
        java.util.List<Payment> paymentList13 = dataLayer12.getAllPayments();
        java.util.List<Payment> paymentList14 = dataLayer12.getAllPayments();
        Payment payment19 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean20 = dataLayer12.savePayment(payment19);
        Payment payment22 = dataLayer12.getPaymentById("hi!");
        Payment payment27 = new Payment("", "hi!", 0.0d, "");
        boolean boolean28 = dataLayer12.savePayment(payment27);
        Payment payment30 = dataLayer12.getPaymentById("");
        BusinessLayer businessLayer31 = new BusinessLayer(dataLayer12);
        DataLayer dataLayer32 = new DataLayer();
        java.util.List<Payment> paymentList33 = dataLayer32.getAllPayments();
        Payment payment35 = dataLayer32.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        Payment payment42 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str43 = payment42.getUserId();
        java.lang.String str44 = payment42.toString();
        boolean boolean45 = dataLayer36.savePayment(payment42);
        DataLayer dataLayer46 = new DataLayer();
        java.util.List<Payment> paymentList47 = dataLayer46.getAllPayments();
        BusinessLayer businessLayer48 = new BusinessLayer(dataLayer46);
        Payment payment50 = businessLayer48.getPaymentDetails("");
        java.util.List<Payment> paymentList51 = businessLayer48.getAllPayments();
        java.util.List<Payment> paymentList52 = businessLayer48.getAllPayments();
        Payment payment57 = new Payment("", "hi!", 0.0d, "");
        businessLayer48.processPayment(payment57);
        boolean boolean59 = dataLayer36.savePayment(payment57);
        DataLayer dataLayer60 = new DataLayer();
        Payment payment65 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str66 = payment65.getUserId();
        java.lang.String str67 = payment65.toString();
        boolean boolean68 = dataLayer60.savePayment(payment65);
        Payment payment70 = dataLayer60.getPaymentById("");
        java.lang.String str71 = payment70.getTransactionId();
        boolean boolean72 = dataLayer36.savePayment(payment70);
        boolean boolean73 = dataLayer32.savePayment(payment70);
        Payment payment75 = dataLayer32.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment77 = dataLayer32.getPaymentById("hi!");
        BusinessLayer businessLayer78 = new BusinessLayer(dataLayer32);
        DataLayer dataLayer79 = new DataLayer();
        java.util.List<Payment> paymentList80 = dataLayer79.getAllPayments();
        Payment payment85 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str86 = payment85.getUserId();
        java.lang.String str87 = payment85.toString();
        boolean boolean88 = dataLayer79.savePayment(payment85);
        java.lang.String str89 = payment85.getDescription();
        java.lang.String str90 = payment85.getDescription();
        businessLayer78.processPayment(payment85);
        businessLayer31.processPayment(payment85);
        boolean boolean93 = dataLayer0.savePayment(payment85);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(paymentList14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(payment30);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNull(payment35);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str44, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentList47);
        org.junit.Assert.assertNull(payment50);
        org.junit.Assert.assertNotNull(paymentList51);
        org.junit.Assert.assertNotNull(paymentList52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str67, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(payment70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(payment75);
        org.junit.Assert.assertNull(payment77);
        org.junit.Assert.assertNotNull(paymentList80);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str87, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        Payment payment38 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
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
        org.junit.Assert.assertNull(payment38);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        java.lang.Class<?> wildcardClass58 = businessLayer2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        Payment payment30 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str31 = payment30.getUserId();
        double double32 = payment30.getAmount();
        java.lang.String str33 = payment30.getUserId();
        java.lang.String str34 = payment30.getDescription();
        boolean boolean35 = dataLayer0.savePayment(payment30);
        Payment payment40 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", 32.0d, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean41 = dataLayer0.savePayment(payment40);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        Payment payment4 = new Payment("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (-1.0d), "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        BusinessLayer businessLayer94 = new BusinessLayer(dataLayer0);
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
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        Payment payment9 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList10 = businessLayer2.getAllPayments();
        Payment payment12 = businessLayer2.getPaymentDetails("");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNull(payment9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNull(payment12);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment6 = dataLayer0.getPaymentById("");
        Payment payment8 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        BusinessLayer businessLayer9 = new BusinessLayer(dataLayer0);
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        java.util.List<Payment> paymentList12 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNull(payment8);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        Payment payment4 = new Payment("", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (-1.0d), "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        java.lang.String str46 = payment44.toString();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str46, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}", "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", (double) '#', "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.lang.String str5 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        Payment payment32 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str33 = payment32.getUserId();
        java.lang.String str34 = payment32.toString();
        boolean boolean35 = dataLayer26.savePayment(payment32);
        BusinessLayer businessLayer36 = new BusinessLayer(dataLayer26);
        DataLayer dataLayer37 = new DataLayer();
        java.util.List<Payment> paymentList38 = dataLayer37.getAllPayments();
        Payment payment40 = dataLayer37.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer41 = new BusinessLayer(dataLayer37);
        Payment payment46 = new Payment("", "hi!", 0.0d, "");
        java.lang.String str47 = payment46.getTransactionId();
        businessLayer41.processPayment(payment46);
        businessLayer36.processPayment(payment46);
        boolean boolean50 = dataLayer0.savePayment(payment46);
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
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str34, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentList38);
        org.junit.Assert.assertNull(payment40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        java.lang.String str52 = payment45.getUserId();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        BusinessLayer businessLayer38 = new BusinessLayer(dataLayer36);
        DataLayer dataLayer39 = new DataLayer();
        java.util.List<Payment> paymentList40 = dataLayer39.getAllPayments();
        Payment payment45 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str46 = payment45.getUserId();
        java.lang.String str47 = payment45.toString();
        boolean boolean48 = dataLayer39.savePayment(payment45);
        java.lang.String str49 = payment45.getTransactionId();
        double double50 = payment45.getAmount();
        businessLayer38.processPayment(payment45);
        java.util.List<Payment> paymentList52 = businessLayer38.getAllPayments();
        java.util.List<Payment> paymentList53 = businessLayer38.getAllPayments();
        Payment payment58 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 0, "hi!");
        businessLayer38.processPayment(payment58);
        java.lang.String str60 = payment58.getUserId();
        boolean boolean61 = dataLayer0.savePayment(payment58);
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
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNotNull(paymentList40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str47, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList52);
        org.junit.Assert.assertNotNull(paymentList53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str60, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        java.lang.String str11 = payment10.getDescription();
        java.lang.String str12 = payment10.getUserId();
        java.lang.String str13 = payment10.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        Payment payment96 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=10.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        BusinessLayer businessLayer97 = new BusinessLayer(dataLayer0);
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
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        java.lang.String str11 = payment10.getDescription();
        java.lang.String str12 = payment10.getUserId();
        java.lang.String str13 = payment10.getTransactionId();
        java.lang.String str14 = payment10.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment15 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertNull(payment15);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        java.lang.String str20 = payment14.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
        DataLayer dataLayer47 = new DataLayer();
        java.util.List<Payment> paymentList48 = dataLayer47.getAllPayments();
        Payment payment53 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str54 = payment53.getUserId();
        java.lang.String str55 = payment53.toString();
        boolean boolean56 = dataLayer47.savePayment(payment53);
        DataLayer dataLayer57 = new DataLayer();
        java.util.List<Payment> paymentList58 = dataLayer57.getAllPayments();
        BusinessLayer businessLayer59 = new BusinessLayer(dataLayer57);
        Payment payment61 = businessLayer59.getPaymentDetails("");
        java.util.List<Payment> paymentList62 = businessLayer59.getAllPayments();
        java.util.List<Payment> paymentList63 = businessLayer59.getAllPayments();
        Payment payment68 = new Payment("", "hi!", 0.0d, "");
        businessLayer59.processPayment(payment68);
        boolean boolean70 = dataLayer47.savePayment(payment68);
        DataLayer dataLayer71 = new DataLayer();
        Payment payment76 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str77 = payment76.getUserId();
        java.lang.String str78 = payment76.toString();
        boolean boolean79 = dataLayer71.savePayment(payment76);
        Payment payment81 = dataLayer71.getPaymentById("");
        java.lang.String str82 = payment81.getTransactionId();
        boolean boolean83 = dataLayer47.savePayment(payment81);
        java.lang.String str84 = payment81.toString();
        java.lang.String str85 = payment81.getUserId();
        java.lang.String str86 = payment81.toString();
        java.lang.String str87 = payment81.getUserId();
        boolean boolean88 = dataLayer0.savePayment(payment81);
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
        org.junit.Assert.assertNotNull(paymentList48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str55, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paymentList58);
        org.junit.Assert.assertNull(payment61);
        org.junit.Assert.assertNotNull(paymentList62);
        org.junit.Assert.assertNotNull(paymentList63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str78, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(payment81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str84, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str86, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer12 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList13 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList14 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(paymentList14);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
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
        Payment payment83 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) 10L, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean84 = dataLayer0.savePayment(payment83);
        java.lang.String str85 = payment83.getTransactionId();
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}" + "'", str85, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        Payment payment17 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer0);
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
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        java.lang.String str24 = payment21.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        DataLayer dataLayer20 = new DataLayer();
        java.util.List<Payment> paymentList21 = dataLayer20.getAllPayments();
        java.util.List<Payment> paymentList22 = dataLayer20.getAllPayments();
        Payment payment24 = dataLayer20.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer25 = new DataLayer();
        Payment payment30 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str31 = payment30.getUserId();
        java.lang.String str32 = payment30.toString();
        boolean boolean33 = dataLayer25.savePayment(payment30);
        boolean boolean34 = dataLayer20.savePayment(payment30);
        BusinessLayer businessLayer35 = new BusinessLayer(dataLayer20);
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        BusinessLayer businessLayer38 = new BusinessLayer(dataLayer36);
        Payment payment40 = businessLayer38.getPaymentDetails("");
        java.util.List<Payment> paymentList41 = businessLayer38.getAllPayments();
        java.util.List<Payment> paymentList42 = businessLayer38.getAllPayments();
        Payment payment47 = new Payment("", "hi!", 0.0d, "");
        businessLayer38.processPayment(payment47);
        java.lang.String str49 = payment47.getDescription();
        businessLayer35.processPayment(payment47);
        businessLayer11.processPayment(payment47);
        DataLayer dataLayer52 = new DataLayer();
        java.util.List<Payment> paymentList53 = dataLayer52.getAllPayments();
        Payment payment55 = dataLayer52.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment60 = new Payment("", "hi!", 0.0d, "");
        double double61 = payment60.getAmount();
        boolean boolean62 = dataLayer52.savePayment(payment60);
        java.lang.String str63 = payment60.getTransactionId();
        java.lang.String str64 = payment60.getTransactionId();
        businessLayer11.processPayment(payment60);
        java.util.List<Payment> paymentList66 = businessLayer11.getAllPayments();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str18, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertNull(payment24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str32, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(payment40);
        org.junit.Assert.assertNotNull(paymentList41);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(paymentList53);
        org.junit.Assert.assertNull(payment55);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(paymentList66);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("");
        java.util.List<Payment> paymentList12 = dataLayer0.getAllPayments();
        Payment payment14 = dataLayer0.getPaymentById("hi!");
        java.util.List<Payment> paymentList15 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(payment14);
        org.junit.Assert.assertNotNull(paymentList15);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        double double9 = payment7.getAmount();
        java.lang.String str10 = payment7.getUserId();
        java.lang.String str11 = payment7.getDescription();
        double double12 = payment7.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        java.util.List<Payment> paymentList64 = dataLayer0.getAllPayments();
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
        org.junit.Assert.assertNotNull(paymentList64);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
        DataLayer dataLayer36 = new DataLayer();
        java.util.List<Payment> paymentList37 = dataLayer36.getAllPayments();
        BusinessLayer businessLayer38 = new BusinessLayer(dataLayer36);
        Payment payment40 = businessLayer38.getPaymentDetails("");
        java.util.List<Payment> paymentList41 = businessLayer38.getAllPayments();
        java.util.List<Payment> paymentList42 = businessLayer38.getAllPayments();
        Payment payment47 = new Payment("", "hi!", 0.0d, "");
        businessLayer38.processPayment(payment47);
        java.lang.String str49 = payment47.getTransactionId();
        businessLayer2.processPayment(payment47);
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
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(payment40);
        org.junit.Assert.assertNotNull(paymentList41);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        java.lang.Class<?> wildcardClass53 = dataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        BusinessLayer businessLayer22 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList23 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(payment18);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList23);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment7 = new Payment("", "hi!", 0.0d, "");
        businessLayer2.processPayment(payment7);
        Payment payment10 = businessLayer2.getPaymentDetails("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        java.util.List<Payment> paymentList11 = businessLayer2.getAllPayments();
        Payment payment16 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str17 = payment16.getUserId();
        double double18 = payment16.getAmount();
        java.lang.String str19 = payment16.toString();
        businessLayer2.processPayment(payment16);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str19, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.lang.String str9 = payment7.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        java.lang.String str11 = payment10.getDescription();
        java.lang.String str12 = payment10.getUserId();
        java.lang.String str13 = payment10.getTransactionId();
        java.lang.String str14 = payment10.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str14, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        Payment payment6 = businessLayer2.getPaymentDetails("hi!");
        DataLayer dataLayer7 = new DataLayer();
        java.util.List<Payment> paymentList8 = dataLayer7.getAllPayments();
        java.util.List<Payment> paymentList9 = dataLayer7.getAllPayments();
        Payment payment11 = dataLayer7.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer12 = new DataLayer();
        Payment payment17 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str18 = payment17.getUserId();
        java.lang.String str19 = payment17.toString();
        boolean boolean20 = dataLayer12.savePayment(payment17);
        boolean boolean21 = dataLayer7.savePayment(payment17);
        Payment payment26 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str27 = payment26.getUserId();
        boolean boolean28 = dataLayer7.savePayment(payment26);
        java.lang.String str29 = payment26.getTransactionId();
        double double30 = payment26.getAmount();
        businessLayer2.processPayment(payment26);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str19, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        Payment payment4 = new Payment("hi!", "hi!", 10.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) 10, "hi!");
        java.lang.String str5 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        java.lang.String str31 = payment27.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str31, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        java.lang.String str14 = payment6.getUserId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        java.lang.Class<?> wildcardClass36 = paymentList35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.toString();
        java.lang.String str7 = payment4.toString();
        java.lang.String str8 = payment4.toString();
        java.lang.String str9 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment8 = new Payment("", "hi!", 0.0d, "");
        double double9 = payment8.getAmount();
        boolean boolean10 = dataLayer0.savePayment(payment8);
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment15 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer16 = new DataLayer();
        java.util.List<Payment> paymentList17 = dataLayer16.getAllPayments();
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer16);
        Payment payment20 = businessLayer18.getPaymentDetails("");
        java.util.List<Payment> paymentList21 = businessLayer18.getAllPayments();
        java.util.List<Payment> paymentList22 = businessLayer18.getAllPayments();
        DataLayer dataLayer23 = new DataLayer();
        java.util.List<Payment> paymentList24 = dataLayer23.getAllPayments();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer23.savePayment(payment29);
        double double33 = payment29.getAmount();
        businessLayer18.processPayment(payment29);
        boolean boolean35 = dataLayer0.savePayment(payment29);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertNull(payment15);
        org.junit.Assert.assertNotNull(paymentList17);
        org.junit.Assert.assertNull(payment20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        DataLayer dataLayer26 = new DataLayer();
        java.util.List<Payment> paymentList27 = dataLayer26.getAllPayments();
        java.util.List<Payment> paymentList28 = dataLayer26.getAllPayments();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean34 = dataLayer26.savePayment(payment33);
        Payment payment36 = dataLayer26.getPaymentById("hi!");
        BusinessLayer businessLayer37 = new BusinessLayer(dataLayer26);
        Payment payment42 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "hi!", (double) '#', "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        boolean boolean43 = dataLayer26.savePayment(payment42);
        boolean boolean44 = dataLayer0.savePayment(payment42);
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
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertNotNull(paymentList28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(payment36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 1L, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.getTransactionId();
        java.lang.String str6 = payment4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str5, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str6, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
        BusinessLayer businessLayer16 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNull(payment14);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=10.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment13);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
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
        java.lang.String str33 = payment29.getUserId();
        java.lang.String str34 = payment29.toString();
        java.lang.String str35 = payment29.getUserId();
        java.lang.String str36 = payment29.toString();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str33, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}" + "'", str34, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str35, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}" + "'", str36, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        Payment payment96 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=10.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.util.List<Payment> paymentList97 = dataLayer0.getAllPayments();
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
        org.junit.Assert.assertNotNull(paymentList97);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
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
        Payment payment42 = businessLayer15.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.util.List<Payment> paymentList43 = businessLayer15.getAllPayments();
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
        org.junit.Assert.assertNotNull(paymentList43);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        Payment payment26 = new Payment("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (double) '4', "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        boolean boolean27 = dataLayer0.savePayment(payment26);
        Payment payment29 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(payment21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(payment29);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        Payment payment61 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}'}");
        DataLayer dataLayer62 = new DataLayer();
        java.util.List<Payment> paymentList63 = dataLayer62.getAllPayments();
        Payment payment65 = dataLayer62.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment70 = new Payment("", "hi!", 0.0d, "");
        double double71 = payment70.getAmount();
        boolean boolean72 = dataLayer62.savePayment(payment70);
        java.lang.String str73 = payment70.toString();
        double double74 = payment70.getAmount();
        java.lang.String str75 = payment70.toString();
        java.lang.String str76 = payment70.getTransactionId();
        businessLayer2.processPayment(payment70);
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
        org.junit.Assert.assertNull(payment61);
        org.junit.Assert.assertNotNull(paymentList63);
        org.junit.Assert.assertNull(payment65);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str73, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str75, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        Payment payment20 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str13, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(payment16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(payment20);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        Payment payment4 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str5 = payment4.toString();
        java.lang.String str6 = payment4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str6, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer10 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList11 = businessLayer10.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (short) -1, "Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str5, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        Payment payment4 = new Payment("", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=32.0, description='hi!'}", (double) (byte) 100, "Payment{transactionId='', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}'}");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}'}", 0.0d, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        java.lang.String str26 = payment24.getUserId();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment6 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str7 = payment6.getUserId();
        java.lang.String str8 = payment6.toString();
        boolean boolean9 = dataLayer0.savePayment(payment6);
        java.util.List<Payment> paymentList10 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList11 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str8, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        DataLayer dataLayer17 = new DataLayer();
        java.util.List<Payment> paymentList18 = dataLayer17.getAllPayments();
        java.util.List<Payment> paymentList19 = dataLayer17.getAllPayments();
        Payment payment21 = dataLayer17.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer22 = new DataLayer();
        Payment payment27 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str28 = payment27.getUserId();
        java.lang.String str29 = payment27.toString();
        boolean boolean30 = dataLayer22.savePayment(payment27);
        boolean boolean31 = dataLayer17.savePayment(payment27);
        DataLayer dataLayer32 = new DataLayer();
        java.util.List<Payment> paymentList33 = dataLayer32.getAllPayments();
        Payment payment38 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str39 = payment38.getUserId();
        java.lang.String str40 = payment38.toString();
        boolean boolean41 = dataLayer32.savePayment(payment38);
        double double42 = payment38.getAmount();
        java.lang.String str43 = payment38.getUserId();
        boolean boolean44 = dataLayer17.savePayment(payment38);
        Payment payment49 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str50 = payment49.getUserId();
        double double51 = payment49.getAmount();
        java.lang.String str52 = payment49.toString();
        boolean boolean53 = dataLayer17.savePayment(payment49);
        BusinessLayer businessLayer54 = new BusinessLayer(dataLayer17);
        Payment payment59 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) (short) 10, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean60 = dataLayer17.savePayment(payment59);
        java.lang.String str61 = payment59.getTransactionId();
        boolean boolean62 = dataLayer0.savePayment(payment59);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str29, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str40, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str52, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str61, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='', userId='', amount=10.0, description='hi!'}", (double) '4', "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        double double5 = payment4.getAmount();
        java.lang.String str6 = payment4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}'}" + "'", str6, "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}'}");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        java.lang.Class<?> wildcardClass62 = payment54.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=10.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "hi!", (double) 100.0f, "Payment{transactionId='', userId='hi!', amount=10.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
        double double21 = payment19.getAmount();
        java.lang.String str22 = payment19.toString();
        java.lang.String str23 = payment19.getDescription();
        java.lang.String str24 = payment19.getDescription();
        java.lang.String str25 = payment19.toString();
        boolean boolean26 = dataLayer0.savePayment(payment19);
        Payment payment28 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str22, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str25, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(payment28);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        java.lang.String str11 = payment10.getUserId();
        java.lang.String str12 = payment10.getTransactionId();
        java.lang.Class<?> wildcardClass13 = payment10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
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
        BusinessLayer businessLayer96 = new BusinessLayer(dataLayer0);
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
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", (double) '#', "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}" + "'", str5, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}", (double) (short) 0, "Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
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
        Payment payment52 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str53 = payment52.getUserId();
        java.lang.String str54 = payment52.getUserId();
        java.lang.String str55 = payment52.getUserId();
        java.lang.String str56 = payment52.getUserId();
        businessLayer46.processPayment(payment52);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        java.lang.Class<?> wildcardClass22 = payment15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
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
        Payment payment44 = null;
        // The following exception was thrown during execution in test generation
        try {
            businessLayer2.processPayment(payment44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Payment.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        Payment payment4 = new Payment("hi!", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 100.0f, "");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer2 = new BusinessLayer(dataLayer0);
        Payment payment4 = businessLayer2.getPaymentDetails("");
        java.util.List<Payment> paymentList5 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList6 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList7 = businessLayer2.getAllPayments();
        java.util.List<Payment> paymentList8 = businessLayer2.getAllPayments();
        Payment payment10 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        java.util.List<Payment> paymentList11 = businessLayer2.getAllPayments();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
        java.lang.String str20 = payment13.getTransactionId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str15, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str16, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str17, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str19, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        Payment payment4 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "", (double) (short) -1, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=32.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        java.lang.String str16 = payment10.getTransactionId();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str12, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        java.lang.String str11 = payment10.getDescription();
        java.lang.String str12 = payment10.getTransactionId();
        java.lang.String str13 = payment10.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
        Payment payment41 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str42 = payment41.getUserId();
        java.lang.String str43 = payment41.toString();
        boolean boolean44 = dataLayer36.savePayment(payment41);
        java.util.List<Payment> paymentList45 = dataLayer36.getAllPayments();
        Payment payment47 = dataLayer36.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer48 = new BusinessLayer(dataLayer36);
        Payment payment50 = dataLayer36.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment55 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) (byte) -1, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.lang.String str56 = payment55.getDescription();
        double double57 = payment55.getAmount();
        boolean boolean58 = dataLayer36.savePayment(payment55);
        Payment payment63 = new Payment("Payment{transactionId='', userId='', amount=10.0, description='hi!'}", "Payment{transactionId='', userId='hi!', amount=0.0, description=''}", (double) 100.0f, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean64 = dataLayer36.savePayment(payment63);
        businessLayer15.processPayment(payment63);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str43, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertNull(payment47);
        org.junit.Assert.assertNull(payment50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str56, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        java.util.List<Payment> paymentList9 = dataLayer0.getAllPayments();
        Payment payment11 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        java.util.List<Payment> paymentList12 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer13 = new BusinessLayer(dataLayer0);
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNull(payment11);
        org.junit.Assert.assertNotNull(paymentList12);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        Payment payment10 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer11 = new BusinessLayer(dataLayer0);
        Payment payment13 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        BusinessLayer businessLayer14 = new BusinessLayer(dataLayer0);
        DataLayer dataLayer15 = new DataLayer();
        Payment payment17 = dataLayer15.getPaymentById("hi!");
        BusinessLayer businessLayer18 = new BusinessLayer(dataLayer15);
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        java.util.List<Payment> paymentList21 = dataLayer19.getAllPayments();
        Payment payment23 = dataLayer19.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer24 = new DataLayer();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer24.savePayment(payment29);
        boolean boolean33 = dataLayer19.savePayment(payment29);
        DataLayer dataLayer34 = new DataLayer();
        java.util.List<Payment> paymentList35 = dataLayer34.getAllPayments();
        Payment payment40 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str41 = payment40.getUserId();
        java.lang.String str42 = payment40.toString();
        boolean boolean43 = dataLayer34.savePayment(payment40);
        double double44 = payment40.getAmount();
        java.lang.String str45 = payment40.getUserId();
        boolean boolean46 = dataLayer19.savePayment(payment40);
        DataLayer dataLayer47 = new DataLayer();
        java.util.List<Payment> paymentList48 = dataLayer47.getAllPayments();
        Payment payment50 = dataLayer47.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment55 = new Payment("", "hi!", 0.0d, "");
        double double56 = payment55.getAmount();
        boolean boolean57 = dataLayer47.savePayment(payment55);
        java.lang.String str58 = payment55.toString();
        double double59 = payment55.getAmount();
        java.lang.String str60 = payment55.getDescription();
        boolean boolean61 = dataLayer19.savePayment(payment55);
        boolean boolean62 = dataLayer15.savePayment(payment55);
        Payment payment64 = dataLayer15.getPaymentById("");
        boolean boolean65 = dataLayer0.savePayment(payment64);
        Payment payment70 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=1.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}'}", (double) (short) 10, "Payment{transactionId='hi!', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=10.0, description=''}");
        boolean boolean71 = dataLayer0.savePayment(payment70);
        BusinessLayer businessLayer72 = new BusinessLayer(dataLayer0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(payment10);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertNull(payment17);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNull(payment23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentList35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str42, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paymentList48);
        org.junit.Assert.assertNull(payment50);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str58, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(payment64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
        Payment payment32 = businessLayer5.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
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
        org.junit.Assert.assertNull(payment32);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        Payment payment41 = dataLayer0.getPaymentById("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=10.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        BusinessLayer businessLayer42 = new BusinessLayer(dataLayer0);
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
        org.junit.Assert.assertNull(payment41);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        Payment payment4 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str5 = payment4.getUserId();
        double double6 = payment4.getAmount();
        java.lang.String str7 = payment4.getUserId();
        double double8 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        Payment payment7 = new Payment("", "", (double) 10L, "hi!");
        boolean boolean8 = dataLayer0.savePayment(payment7);
        java.lang.String str9 = payment7.getDescription();
        java.lang.String str10 = payment7.getUserId();
        double double11 = payment7.getAmount();
        java.lang.String str12 = payment7.getUserId();
        double double13 = payment7.getAmount();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList2 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList3 = dataLayer0.getAllPayments();
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment6 = dataLayer0.getPaymentById("Payment{transactionId='', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}'}");
        Payment payment11 = new Payment("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', amount=52.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (double) '4', "Payment{transactionId='hi!', userId='', amount=100.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}");
        boolean boolean12 = dataLayer0.savePayment(payment11);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNull(payment6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
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
        Payment payment52 = new Payment("Payment{transactionId='hi!', userId='', amount=0.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", "Payment{transactionId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', userId='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='hi!', amount=-1.0, description='Payment{transactionId='', userId='hi!', amount=0.0, description=''}'}', amount=100.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}", (double) (byte) 1, "Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='hi!', amount=35.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        boolean boolean53 = dataLayer0.savePayment(payment52);
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        java.lang.String str15 = payment8.getDescription();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str11, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str13, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
        BusinessLayer businessLayer20 = new BusinessLayer(dataLayer18);
        Payment payment22 = businessLayer20.getPaymentDetails("hi!");
        java.util.List<Payment> paymentList23 = businessLayer20.getAllPayments();
        java.util.List<Payment> paymentList24 = businessLayer20.getAllPayments();
        Payment payment26 = businessLayer20.getPaymentDetails("hi!");
        DataLayer dataLayer27 = new DataLayer();
        java.util.List<Payment> paymentList28 = dataLayer27.getAllPayments();
        Payment payment33 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str34 = payment33.getUserId();
        java.lang.String str35 = payment33.toString();
        boolean boolean36 = dataLayer27.savePayment(payment33);
        DataLayer dataLayer37 = new DataLayer();
        java.util.List<Payment> paymentList38 = dataLayer37.getAllPayments();
        BusinessLayer businessLayer39 = new BusinessLayer(dataLayer37);
        Payment payment41 = businessLayer39.getPaymentDetails("");
        java.util.List<Payment> paymentList42 = businessLayer39.getAllPayments();
        java.util.List<Payment> paymentList43 = businessLayer39.getAllPayments();
        Payment payment48 = new Payment("", "hi!", 0.0d, "");
        businessLayer39.processPayment(payment48);
        boolean boolean50 = dataLayer27.savePayment(payment48);
        DataLayer dataLayer51 = new DataLayer();
        Payment payment56 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str57 = payment56.getUserId();
        java.lang.String str58 = payment56.toString();
        boolean boolean59 = dataLayer51.savePayment(payment56);
        Payment payment61 = dataLayer51.getPaymentById("");
        java.lang.String str62 = payment61.getTransactionId();
        boolean boolean63 = dataLayer27.savePayment(payment61);
        java.lang.String str64 = payment61.toString();
        java.lang.String str65 = payment61.getUserId();
        java.lang.String str66 = payment61.getUserId();
        java.lang.String str67 = payment61.toString();
        java.lang.String str68 = payment61.toString();
        businessLayer20.processPayment(payment61);
        businessLayer2.processPayment(payment61);
        Payment payment72 = businessLayer2.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str11, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(payment17);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNull(payment22);
        org.junit.Assert.assertNotNull(paymentList23);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertNull(payment26);
        org.junit.Assert.assertNotNull(paymentList28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str35, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentList38);
        org.junit.Assert.assertNull(payment41);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertNotNull(paymentList43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str58, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(payment61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str64, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str67, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str68, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertNull(payment72);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        DataLayer dataLayer19 = new DataLayer();
        java.util.List<Payment> paymentList20 = dataLayer19.getAllPayments();
        java.util.List<Payment> paymentList21 = dataLayer19.getAllPayments();
        Payment payment23 = dataLayer19.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        DataLayer dataLayer24 = new DataLayer();
        Payment payment29 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str30 = payment29.getUserId();
        java.lang.String str31 = payment29.toString();
        boolean boolean32 = dataLayer24.savePayment(payment29);
        boolean boolean33 = dataLayer19.savePayment(payment29);
        BusinessLayer businessLayer34 = new BusinessLayer(dataLayer19);
        Payment payment36 = businessLayer34.getPaymentDetails("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        Payment payment38 = businessLayer34.getPaymentDetails("hi!");
        DataLayer dataLayer39 = new DataLayer();
        Payment payment44 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str45 = payment44.getUserId();
        java.lang.String str46 = payment44.toString();
        boolean boolean47 = dataLayer39.savePayment(payment44);
        Payment payment49 = dataLayer39.getPaymentById("");
        BusinessLayer businessLayer50 = new BusinessLayer(dataLayer39);
        Payment payment55 = new Payment("", "hi!", 0.0d, "");
        double double56 = payment55.getAmount();
        java.lang.String str57 = payment55.toString();
        businessLayer50.processPayment(payment55);
        businessLayer34.processPayment(payment55);
        java.lang.String str60 = payment55.getTransactionId();
        java.lang.String str61 = payment55.getDescription();
        businessLayer2.processPayment(payment55);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str15, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertNull(payment23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str31, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(payment36);
        org.junit.Assert.assertNull(payment38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str46, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(payment49);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str57, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
        java.util.List<Payment> paymentList36 = businessLayer2.getAllPayments();
        DataLayer dataLayer37 = new DataLayer();
        java.util.List<Payment> paymentList38 = dataLayer37.getAllPayments();
        Payment payment43 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str44 = payment43.getUserId();
        java.lang.String str45 = payment43.toString();
        boolean boolean46 = dataLayer37.savePayment(payment43);
        DataLayer dataLayer47 = new DataLayer();
        Payment payment52 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str53 = payment52.getUserId();
        java.lang.String str54 = payment52.toString();
        boolean boolean55 = dataLayer47.savePayment(payment52);
        java.lang.String str56 = payment52.getDescription();
        java.lang.String str57 = payment52.toString();
        boolean boolean58 = dataLayer37.savePayment(payment52);
        java.lang.String str59 = payment52.toString();
        businessLayer2.processPayment(payment52);
        java.lang.String str61 = payment52.toString();
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
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertNotNull(paymentList38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str45, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str54, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str57, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str59, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str61, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
        java.lang.Class<?> wildcardClass53 = dataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        java.util.List<Payment> paymentList59 = dataLayer0.getAllPayments();
        java.util.List<Payment> paymentList60 = dataLayer0.getAllPayments();
        Payment payment62 = dataLayer0.getPaymentById("");
        Payment payment67 = new Payment("Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}", "", (double) 10.0f, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        boolean boolean68 = dataLayer0.savePayment(payment67);
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
        org.junit.Assert.assertNotNull(paymentList59);
        org.junit.Assert.assertNotNull(paymentList60);
        org.junit.Assert.assertNotNull(payment62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment2 = dataLayer0.getPaymentById("hi!");
        BusinessLayer businessLayer3 = new BusinessLayer(dataLayer0);
        java.util.List<Payment> paymentList4 = dataLayer0.getAllPayments();
        org.junit.Assert.assertNull(payment2);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
        Payment payment47 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=10.0, description='Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}'}");
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
        org.junit.Assert.assertNull(payment47);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        DataLayer dataLayer0 = new DataLayer();
        java.util.List<Payment> paymentList1 = dataLayer0.getAllPayments();
        Payment payment3 = dataLayer0.getPaymentById("Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        BusinessLayer businessLayer4 = new BusinessLayer(dataLayer0);
        Payment payment9 = new Payment("hi!", "", (double) 100.0f, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        businessLayer4.processPayment(payment9);
        java.util.List<Payment> paymentList11 = businessLayer4.getAllPayments();
        Payment payment13 = businessLayer4.getPaymentDetails("Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        Payment payment15 = businessLayer4.getPaymentDetails("Payment{transactionId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=0.0, description='hi!'}");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(payment3);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(payment13);
        org.junit.Assert.assertNull(payment15);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        DataLayer dataLayer0 = new DataLayer();
        Payment payment5 = new Payment("", "", (double) 10L, "hi!");
        java.lang.String str6 = payment5.getUserId();
        java.lang.String str7 = payment5.toString();
        boolean boolean8 = dataLayer0.savePayment(payment5);
        Payment payment10 = dataLayer0.getPaymentById("");
        java.lang.String str11 = payment10.getDescription();
        java.lang.String str12 = payment10.getTransactionId();
        double double13 = payment10.getAmount();
        double double14 = payment10.getAmount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Payment{transactionId='', userId='', amount=10.0, description='hi!'}" + "'", str7, "Payment{transactionId='', userId='', amount=10.0, description='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(payment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        Payment payment4 = new Payment("Payment{transactionId='', userId='hi!', amount=0.0, description=''}", "", (double) 100.0f, "Payment{transactionId='Payment{transactionId='', userId='', amount=10.0, description='hi!'}', userId='Payment{transactionId='', userId='hi!', amount=0.0, description=''}', amount=-1.0, description='Payment{transactionId='', userId='', amount=10.0, description='hi!'}'}");
        java.lang.String str5 = payment4.getTransactionId();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Payment{transactionId='', userId='hi!', amount=0.0, description=''}" + "'", str5, "Payment{transactionId='', userId='hi!', amount=0.0, description=''}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

