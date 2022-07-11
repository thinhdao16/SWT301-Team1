using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System;

namespace Team1
{
    [TestClass]
    public class UnitTest1
    {
        public Boolean test(string date)
        {
            ChromeDriver chromeDriver = new ChromeDriver();
            chromeDriver.Url = "http://localhost:3000/";
            chromeDriver.Navigate();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys(date);
            chromeDriver.FindElement(By.Id("alert")).Click();
            Boolean s = Boolean.Parse(chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            chromeDriver.Close();
            return s;
        }

        [TestMethod]
        public void TestMethod1()
        {
            Assert.AreEqual(true, test("20/10/2020"));
        }
        [TestMethod]
        public void TestMethod2()
        {
            Assert.AreEqual(false, test("20adasd/10/2020"));
        }
        [TestMethod]
        public void TestMethod3()
        {
            Assert.AreEqual(false, test("../1../2020"));
        }
        [TestMethod]
        public void TestMethod4()
        {
            Assert.AreEqual(true, test("29/2/2020"));
        }
    }
}
