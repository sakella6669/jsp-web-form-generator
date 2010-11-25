package br.inf.carlos.wfg.gui.forms;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import br.inf.carlos.wfg.gui.FrameMenuInicial;
import br.inf.carlos.wfg.gui.object.ObjectProperties;

/**
 * Modelo padrão para o JPanel que irá apresentar os atributos da classe que será passada
 * por parâmetro.
 * 
 * @author Carlos A. Junior
 * 
 * @see JPanel
 */
public class PanelModeloConfiguracaoPadrao extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private ObjectProperties objectProperties;
	
	private FrameMenuInicial frameMenuInicial;
	
	private JButton jButton1;
    private JTabbedPane jTabbedPane2;
    private JTabbedPane jTabbedPane3;
    private JTabbedPane jtpBase;

	public PanelModeloConfiguracaoPadrao(ObjectProperties objectProperties, FrameMenuInicial frameMenuInicial)
	{
		this.objectProperties = objectProperties;
		this.frameMenuInicial = frameMenuInicial;
		
		this.initComponents();
	}
	
	private void initComponents()
	{
        jtpBase = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();

        jtpBase.addTab("tab2", jTabbedPane3);
        jtpBase.addTab("tab1", jTabbedPane2);

        jButton1.setText("Salvar Configurações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpBase, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(408, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpBase, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

	public ObjectProperties getObjectProperties() {
		return objectProperties;
	}

	public void setObjectProperties(ObjectProperties objectProperties) {
		this.objectProperties = objectProperties;
	}

	public FrameMenuInicial getFrameMenuInicial() {
		return frameMenuInicial;
	}

	public void setFrameMenuInicial(FrameMenuInicial frameMenuInicial) {
		this.frameMenuInicial = frameMenuInicial;
	}
}