using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace DEMOSELENIUM
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        public String test(string date)
        {
            ChromeDriver chromeDriver = new ChromeDriver();
            chromeDriver.Url = "http://localhost:3000/";
            chromeDriver.Navigate();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys(date);
            chromeDriver.FindElement(By.Id("alert")).Click();
            var s = chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value");
            Thread.Sleep(1000);
            chromeDriver.Close();
            return s;

        }
        private void Button_Click(object sender, RoutedEventArgs e)
        {
            ChromeDriver chromeDriver = new ChromeDriver();
            chromeDriver.Url = "http://localhost:3000/";
            chromeDriver.Navigate();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("20/15/2001");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase1 false : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("29/2/2004");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase2 true : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("29/2/2001");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase3 false : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("2da/2/2001");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase4 false : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("30/2/2001");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase5 false : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("ads/das/dsa");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase6 false : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("31/1/2020");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase7 true : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("31/3/2020");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase8 true : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("31/./2020");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase9 false : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
            Thread.Sleep(1000);
            chromeDriver.FindElement(By.Id("inputPassword5")).Clear();
            chromeDriver.FindElement(By.Id("inputPassword5")).SendKeys("15/11/2020");
            chromeDriver.FindElement(By.Id("alert")).Click();
            Console.WriteLine("testcase10 true : {0}", chromeDriver.FindElement(By.Id("result")).GetDomAttribute("value"));
        }
    }
}
