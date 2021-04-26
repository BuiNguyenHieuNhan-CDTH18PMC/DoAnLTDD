using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;
using DevExpress.XtraEditors;

namespace WindowsFormsApp1
{
    public partial class NhaHang : DevExpress.XtraEditors.XtraForm
    {
        public NhaHang()
        {
            InitializeComponent();
        }

        private void btnBan1_Click(object sender, EventArgs e)
        {
            OpenTable(1);
        }

        private void btnBan2_Click(object sender, EventArgs e)
        {          
        }
        void OpenTable(int sl)
        {
            Ban ban = new Ban();
            
            ban.Show();       
            this.Close();
        }
    }
}