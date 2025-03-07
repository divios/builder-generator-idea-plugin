package pl.mjedynak.idea.plugins.builder.settings;


import com.intellij.ui.components.JBCheckBox;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class BuilderGeneratorSettingsComponent {

        private final JPanel myMainPanel;
        private final JBTextField defaultMethodPrefixText = new JBTextField();
        private final JBCheckBox innerBuilderCheckBox = new JBCheckBox("Inner builder");
        private final JBCheckBox butMethodCheckBox = new JBCheckBox("'but' method'");
        private final JBCheckBox useSinglePrefixCheckBox = new JBCheckBox("Use single prefix");
        private final JBCheckBox generateStaticBuilderMethodBox = new JBCheckBox("Generate static builder method");

        public BuilderGeneratorSettingsComponent() {
            myMainPanel = FormBuilder.createFormBuilder()
                    .addLabeledComponent(new JBLabel("Default prefix: "), defaultMethodPrefixText, 1, false)
                    .addComponent(innerBuilderCheckBox, 1)
                    //.addComponent(butMethodCheckBox, 1)
                    //.addComponent(useSinglePrefixCheckBox, 1)
                    .addComponent(generateStaticBuilderMethodBox)
                    .addComponentFillVertically(new JPanel(), 0)
                    .getPanel();
        }

        public JPanel getPanel() {
            return myMainPanel;
        }

        public JComponent getPreferredFocusedComponent() {
            return defaultMethodPrefixText;
        }

        @NotNull
        public String getDefaultMethodPrefixText() {
            return defaultMethodPrefixText.getText();
        }

        public void setDefaultMethodPrefixText(@NotNull String newText) {
            defaultMethodPrefixText.setText(newText);
        }

        public boolean isInnerBuilder() {
            return innerBuilderCheckBox.isSelected();
        }

        public void setInnerBuilder(boolean isInnerBuilder) {
            innerBuilderCheckBox.setSelected(isInnerBuilder);
        }

        public boolean isButMethod() {
            //return butMethodCheckBox.isSelected();
            return false;
        }

        public void setButMethod(boolean isButMethod) {
            butMethodCheckBox.setSelected(isButMethod);
        }

        public boolean isUseSinglePrefix() {
            //return useSinglePrefixCheckBox.isSelected();
            return false;
        }

        public void setGenerateBuilderMethod(boolean isGenerateBuilderMethod) {
            generateStaticBuilderMethodBox.setSelected(isGenerateBuilderMethod);
        }

        public boolean isGenerateBuilderMethod() {
            return generateStaticBuilderMethodBox.isSelected();
        }

        public void setUseSinglePrefix(boolean isUseSinglePrefix) {
            useSinglePrefixCheckBox.setSelected(isUseSinglePrefix);
        }
    }
