namespace WindowsFormsApp1
{
    partial class Ban
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Ban));
            this.flowLayoutPanel1 = new System.Windows.Forms.FlowLayoutPanel();
            this.btnMoBan = new DevExpress.XtraEditors.SimpleButton();
            this.layout = new System.Windows.Forms.FlowLayoutPanel();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabThucAn = new System.Windows.Forms.TabPage();
            this.btnKhan = new System.Windows.Forms.Button();
            this.btnVe = new System.Windows.Forms.Button();
            this.tabDoUong = new System.Windows.Forms.TabPage();
            this.labelControl1 = new DevExpress.XtraEditors.LabelControl();
            this.lblSoBan = new DevExpress.XtraEditors.LabelControl();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.TenMon = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.SL = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Gia = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.btnBack = new DevExpress.XtraEditors.SimpleButton();
            this.simpleButton1 = new DevExpress.XtraEditors.SimpleButton();
            this.simpleButton2 = new DevExpress.XtraEditors.SimpleButton();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.flowLayoutPanel1.SuspendLayout();
            this.layout.SuspendLayout();
            this.tabControl1.SuspendLayout();
            this.tabThucAn.SuspendLayout();
            this.tabDoUong.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // flowLayoutPanel1
            // 
            this.flowLayoutPanel1.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.flowLayoutPanel1.BackColor = System.Drawing.Color.White;
            this.flowLayoutPanel1.Controls.Add(this.btnBack);
            this.flowLayoutPanel1.Controls.Add(this.btnMoBan);
            this.flowLayoutPanel1.Controls.Add(this.simpleButton1);
            this.flowLayoutPanel1.Controls.Add(this.simpleButton2);
            this.flowLayoutPanel1.Location = new System.Drawing.Point(0, 518);
            this.flowLayoutPanel1.Name = "flowLayoutPanel1";
            this.flowLayoutPanel1.Size = new System.Drawing.Size(1060, 116);
            this.flowLayoutPanel1.TabIndex = 20;
            // 
            // btnMoBan
            // 
            this.btnMoBan.Appearance.Font = new System.Drawing.Font("Tahoma", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMoBan.Appearance.Options.UseFont = true;
            this.btnMoBan.Location = new System.Drawing.Point(134, 3);
            this.btnMoBan.Name = "btnMoBan";
            this.btnMoBan.Size = new System.Drawing.Size(126, 108);
            this.btnMoBan.TabIndex = 21;
            this.btnMoBan.Text = "Mở bàn";
            this.btnMoBan.Click += new System.EventHandler(this.btnMoBan_Click);
            // 
            // layout
            // 
            this.layout.BackColor = System.Drawing.Color.White;
            this.layout.Controls.Add(this.dataGridView1);
            this.layout.Location = new System.Drawing.Point(398, 40);
            this.layout.Name = "layout";
            this.layout.Size = new System.Drawing.Size(648, 463);
            this.layout.TabIndex = 21;
            this.layout.Visible = false;
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabThucAn);
            this.tabControl1.Controls.Add(this.tabDoUong);
            this.tabControl1.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tabControl1.Location = new System.Drawing.Point(12, 12);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(317, 491);
            this.tabControl1.TabIndex = 22;
            // 
            // tabThucAn
            // 
            this.tabThucAn.Controls.Add(this.btnKhan);
            this.tabThucAn.Controls.Add(this.btnVe);
            this.tabThucAn.Location = new System.Drawing.Point(4, 28);
            this.tabThucAn.Name = "tabThucAn";
            this.tabThucAn.Padding = new System.Windows.Forms.Padding(3);
            this.tabThucAn.Size = new System.Drawing.Size(337, 459);
            this.tabThucAn.TabIndex = 0;
            this.tabThucAn.Text = "Thức ăn";
            this.tabThucAn.UseVisualStyleBackColor = true;
            // 
            // btnKhan
            // 
            this.btnKhan.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnKhan.Location = new System.Drawing.Point(107, 6);
            this.btnKhan.Name = "btnKhan";
            this.btnKhan.Size = new System.Drawing.Size(95, 95);
            this.btnKhan.TabIndex = 1;
            this.btnKhan.Text = "Khăn lạnh";
            this.btnKhan.UseVisualStyleBackColor = true;
            this.btnKhan.Click += new System.EventHandler(this.btnKhan_Click);
            // 
            // btnVe
            // 
            this.btnVe.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVe.Location = new System.Drawing.Point(6, 6);
            this.btnVe.Name = "btnVe";
            this.btnVe.Size = new System.Drawing.Size(95, 95);
            this.btnVe.TabIndex = 0;
            this.btnVe.Text = "Vé buffer 100k";
            this.btnVe.UseVisualStyleBackColor = true;
            this.btnVe.Click += new System.EventHandler(this.btnVe_Click);
            // 
            // tabDoUong
            // 
            this.tabDoUong.Controls.Add(this.button3);
            this.tabDoUong.Controls.Add(this.button2);
            this.tabDoUong.Controls.Add(this.button1);
            this.tabDoUong.Location = new System.Drawing.Point(4, 28);
            this.tabDoUong.Name = "tabDoUong";
            this.tabDoUong.Padding = new System.Windows.Forms.Padding(3);
            this.tabDoUong.Size = new System.Drawing.Size(309, 459);
            this.tabDoUong.TabIndex = 1;
            this.tabDoUong.Text = "Đồ uống";
            this.tabDoUong.UseVisualStyleBackColor = true;
            // 
            // labelControl1
            // 
            this.labelControl1.Appearance.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelControl1.Appearance.Options.UseFont = true;
            this.labelControl1.Location = new System.Drawing.Point(711, 12);
            this.labelControl1.Name = "labelControl1";
            this.labelControl1.Size = new System.Drawing.Size(36, 19);
            this.labelControl1.TabIndex = 23;
            this.labelControl1.Text = "Bàn ";
            // 
            // lblSoBan
            // 
            this.lblSoBan.Appearance.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSoBan.Appearance.Options.UseFont = true;
            this.lblSoBan.Location = new System.Drawing.Point(747, 12);
            this.lblSoBan.Name = "lblSoBan";
            this.lblSoBan.Size = new System.Drawing.Size(10, 19);
            this.lblSoBan.TabIndex = 24;
            this.lblSoBan.Text = "1";
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.TenMon,
            this.SL,
            this.Gia});
            this.dataGridView1.Location = new System.Drawing.Point(3, 3);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(645, 460);
            this.dataGridView1.TabIndex = 0;
            // 
            // TenMon
            // 
            this.TenMon.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.TenMon.HeaderText = "Tên Món";
            this.TenMon.Name = "TenMon";
            // 
            // SL
            // 
            this.SL.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.SL.HeaderText = "Số lượng";
            this.SL.Name = "SL";
            // 
            // Gia
            // 
            this.Gia.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Gia.HeaderText = "Giá tiền";
            this.Gia.Name = "Gia";
            // 
            // btnBack
            // 
            this.btnBack.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.btnBack.Appearance.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnBack.Appearance.Options.UseFont = true;
            this.btnBack.ImageOptions.Image = ((System.Drawing.Image)(resources.GetObject("btnBack.ImageOptions.Image")));
            this.btnBack.ImageOptions.ImageToTextAlignment = DevExpress.XtraEditors.ImageAlignToText.TopCenter;
            this.btnBack.Location = new System.Drawing.Point(3, 3);
            this.btnBack.Name = "btnBack";
            this.btnBack.Size = new System.Drawing.Size(125, 108);
            this.btnBack.TabIndex = 15;
            this.btnBack.Text = "Back";
            // 
            // simpleButton1
            // 
            this.simpleButton1.Appearance.Font = new System.Drawing.Font("Tahoma", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.simpleButton1.Appearance.Options.UseFont = true;
            this.simpleButton1.ImageOptions.Image = ((System.Drawing.Image)(resources.GetObject("simpleButton1.ImageOptions.Image")));
            this.simpleButton1.ImageOptions.ImageToTextAlignment = DevExpress.XtraEditors.ImageAlignToText.TopCenter;
            this.simpleButton1.Location = new System.Drawing.Point(266, 3);
            this.simpleButton1.Name = "simpleButton1";
            this.simpleButton1.Size = new System.Drawing.Size(126, 108);
            this.simpleButton1.TabIndex = 22;
            this.simpleButton1.Text = "Tính tiền";
            // 
            // simpleButton2
            // 
            this.simpleButton2.Appearance.Font = new System.Drawing.Font("Tahoma", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.simpleButton2.Appearance.Options.UseFont = true;
            this.simpleButton2.ImageOptions.Image = ((System.Drawing.Image)(resources.GetObject("simpleButton2.ImageOptions.Image")));
            this.simpleButton2.ImageOptions.ImageToTextAlignment = DevExpress.XtraEditors.ImageAlignToText.TopCenter;
            this.simpleButton2.Location = new System.Drawing.Point(398, 3);
            this.simpleButton2.Name = "simpleButton2";
            this.simpleButton2.Size = new System.Drawing.Size(126, 108);
            this.simpleButton2.TabIndex = 23;
            this.simpleButton2.Text = "Member VIP";
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Location = new System.Drawing.Point(6, 6);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(95, 95);
            this.button1.TabIndex = 1;
            this.button1.Text = "Pepsi 20k";
            this.button1.UseVisualStyleBackColor = true;
            // 
            // button2
            // 
            this.button2.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button2.Location = new System.Drawing.Point(107, 6);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(95, 95);
            this.button2.TabIndex = 2;
            this.button2.Text = "7 Up 20k";
            this.button2.UseVisualStyleBackColor = true;
            // 
            // button3
            // 
            this.button3.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button3.Location = new System.Drawing.Point(208, 6);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(95, 95);
            this.button3.TabIndex = 3;
            this.button3.Text = "Sting 20k";
            this.button3.UseVisualStyleBackColor = true;
            // 
            // Ban
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1058, 634);
            this.Controls.Add(this.lblSoBan);
            this.Controls.Add(this.labelControl1);
            this.Controls.Add(this.tabControl1);
            this.Controls.Add(this.layout);
            this.Controls.Add(this.flowLayoutPanel1);
            this.Name = "Ban";
            this.Text = "Ban";
            this.flowLayoutPanel1.ResumeLayout(false);
            this.layout.ResumeLayout(false);
            this.tabControl1.ResumeLayout(false);
            this.tabThucAn.ResumeLayout(false);
            this.tabDoUong.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.FlowLayoutPanel flowLayoutPanel1;
        private DevExpress.XtraEditors.SimpleButton btnBack;
        private DevExpress.XtraEditors.SimpleButton btnMoBan;
        private System.Windows.Forms.FlowLayoutPanel layout;
        private DevExpress.XtraEditors.SimpleButton simpleButton1;
        private DevExpress.XtraEditors.SimpleButton simpleButton2;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn TenMon;
        private System.Windows.Forms.DataGridViewTextBoxColumn SL;
        private System.Windows.Forms.DataGridViewTextBoxColumn Gia;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabThucAn;
        private System.Windows.Forms.Button btnKhan;
        private System.Windows.Forms.Button btnVe;
        private System.Windows.Forms.TabPage tabDoUong;
        private DevExpress.XtraEditors.LabelControl labelControl1;
        private DevExpress.XtraEditors.LabelControl lblSoBan;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button1;
    }
}