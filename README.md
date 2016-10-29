# Ant task to create debian packages
>Based on code.google.com/p/ant-deb-task

An Ant task that allows you to create Debian .deb packages on any platform where Java is available.

Forum:
https://groups.google.com/forum/#!forum/ant-deb-task

# Improvements

Base project seems to be dead so I've made this fork for further fixes/improvmenets.

This Ant task is used to build DBeaver Debian packages. It has no DBeaver dependencies but provides a few additional features which are not supported by base implementation:
- Added support of custom (non-standard) properties for &lt;desktopentry&gt;

```xml
        <desktopentry
                name="Product Name"
                genericName="Generic Name"
                toFile="product.desktop"
                comment="Product description"
                path="/usr/share/product/"
                exec="/usr/share/product/product"
                icon="/usr/share/product/product.png"
                type="Application"
                terminal="false"
                categories="IDE;Development">
            <property name="StartupWMClass">SWT</property>
        </desktopentry>
```
