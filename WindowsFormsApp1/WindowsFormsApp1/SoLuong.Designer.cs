namespace WindowsFormsApp1
{
    partial class SoLuong
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
            this.labelControl1 = new DevExpress.XtraEditors.LabelControl();
            this.editSoLuong = new DevExpress.XtraEditors.TextEdit();
            this.btnThem = new DevExpress.XtraEditors.SimpleButton();
            ((System.ComponentModel.ISupportInitialize)(this.editSoLuong.Properties)).BeginInit();
            this.SuspendLayout();
            // 
            // labelControl1
            // 
            this.labelControl1.Appearance.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelControl1.Appearance.Options.UseFont = true;
            this.labelControl1.Location = new System.Drawing.Point(56, 45);
            this.labelControl1.Name = "labelControl1";
            this.labelControl1.Size = new System.Drawing.Size(71, 19);
            this.labelControl1.TabIndex = 0;
            this.labelControl1.Text = "Số lượng";
            // 
            // editSoLuong
            // 
            this.editSoLuong.Location = new System.Drawing.Point(133, 42);
            this.editSoLuong.Name = "editSoLuong";
            this.editSoLuong.Properties.Appearance.Font = new System.Drawing.Font("Tahoma", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.editSoLuong.Properties.Appearance.Options.UseFont = true;
            this.editSoLuong.Size = new System.Drawing.Size(100, 26);
            this.editSoLuong.TabIndex = 1;
            // 
            // btnThem
            // 
            this.btnThem.Appearance.Font = new System.Drawing.Font("Tahoma", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnThem.Appearance.Options.UseFont = true;
            this.btnThem.Location = new System.Drawing.Point(105, 83);
            this.btnThem.Name = "btnThem";
            this.btnThem.Size = new System.Drawing.Size(107, 34);
            this.btnThem.TabIndex = 2;
            this.btnThem.Text = "Thêm";
            // 
            // SoLuong
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(318, 139);
            this.Controls.Add(this.btnThem);
            this.Controls.Add(this.editSoLuong);
            this.Controls.Add(this.labelControl1);
            this.Name = "SoLuong";
            this.Text = "SoLuong";
            ((System.ComponentModel.ISupportInitialize)(this.editSoLuong.Properties)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private DevExpress.XtraEditors.LabelControl labelControl1;
        private DevExpress.XtraEditors.TextEdit editSoLuong;
        private DevExpress.XtraEditors.SimpleButton btnThem;
    }
}