{"id":"bea2d0b6-9535-40e8-9090-db8402accadf","name":"SeminarOrganizer.ManageSeminar-taskform.frm","model":{"processName":"ManageSeminar","processId":"SeminarOrganizer.ManageSeminar","name":"process","properties":[{"name":"action","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}},{"name":"seminar","typeInfo":{"type":"OBJECT","className":"com.muni.seminarorganizer.Seminar","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"options":[{"value":"create","text":"Create a new seminar"},{"value":"modify","text":"Modify an existing seminar"}],"defaultValue":"create","inline":false,"dataProvider":"","id":"field_3672689437867068E12","name":"action","label":"Select an action","required":true,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"action","standaloneClassName":"java.lang.String","code":"RadioGroup","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.radioGroup.definition.StringRadioGroupFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_3672689437867068E12","form_id":"bea2d0b6-9535-40e8-9090-db8402accadf"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"RadioGroup","cssProperties":{}}]}]}]}]}}