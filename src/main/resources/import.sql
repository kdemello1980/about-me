-- Employers
insert into employers (name, hire_year) values ('Data Direct Netorks', 2017);
insert into employers (name, hire_year) values ('Logic Technology Inc', 2004);

-- Titles
insert into titles (name, from_date, to_date, employer_id) values ('IME Specialist Support Engineer', 2017, 2019, 1);
insert into titles (name, from_date, to_date, employer_id) values ('Technical Director', 2015, 2017, 2);
insert into titles (name, from_date, to_date, employer_id) values ('Principal Consultant', 2009, 2015, 2);
insert into titles (name, from_date, to_date, employer_id) values ('Infrastructure Support Consultant', 2004, 2009, 2);

--Items
insert into items (title_id, text) values (1, 'IME Support Operations - Subject matter expert and Level 3 support engineer for the Infinite Memory Engine (IME) high-performance solid state storage cache product. Worked directly with customers and the development team in order to resolve customer issues and to architect solutions to meet customer performance goals');

insert into items (title_id, text) values (1, 'Performed in-person and remote training sessions on IME administration to lower tier support personnel and system deployment engineers.');

insert into items (title_id, text) values (1,'Reviewed technical documentation for accuracy and completeness.');

insert into items (title_id, text) values (2, 'Cray Operations: Administered the day to day operations of the Cray XC40 and XE6 supercomputing platforms and the associated Data Direct Networks Lustre file system scratch space for GE Global Research (GEGR). Gathered and analyzed performance and utilization data for the purpose of reporting,');

insert into items (title_id, text) values (2,'Strategic Upgrade Planning: Assessed the technical capabilities of hardware and software upgrades to the GEGR’s Cray supercomputer platforms to ensure compatibility with existing user workflows and applications, as well as to plan for future growth of the user base.');

insert into items (title_id, text) values (2,'Cray End User Support: Provided support to the GEGR’s engineers and research scientists in the use of the client’s Cray platforms, including compiling software for native Cray execution, and installing independent software vendor applications');

insert into items (title_id, text) values (2,'Batch System Management: Analyzed batch system data, first Platform LSF and later Altair PBS pro and wrote custom plugins in Perl and Python to maximize throughput on the client’s HPC resources and to minimize the time end user jobs wait in the queue to be processed');

insert into items (title_id, text) values (2,'Automated HPC Resource Selection: Implemented using Python and PBS pro a mechanism to automatically optimize the placement of user jobs in order to simplify the end user experience, optimize resource utilization and to support new programming paradigms, such as OpenMP on Cray and Non-Cray platforms.');

insert into items (title_id, text) values (2,'HPC Software Management: Installed, tested, packaged and deployed open source and ISV software on the GEGR’s Red Hat Enterprise Linux HPC platforms.');

insert into items (title_id, text) values (2,'HPC Operations: Administered the operations of the GE Energy’s Red Hat Enterprise Linux-based HPC clusters involving Nagios, DNS, LDAP, NFS, automount, NIS, DHCP/bootp, LVM, and libvirt virtualization.');

insert into items (title_id, text) values (3, 'Web Based Job Management Portal: Implemented a using the LAMP stack (Linux, Apache, MySQL and Perl), a web based, RESTful job submission and management portal for the client’s global and cross-business high performance computing operations as a cross-development project with GEGR.');

insert into items (title_id, text) values (3, 'Dynamic Storage for User Jobs: Implemented in Perl and Qt an application suite for GE Energy to manage and share SAN attached storage between multiple SGI Altix compute servers to speed time to result by minimizing the  need to transfer data between nodes for batch processing.');

insert into items (title_id, text) values (4, 'Deployed an SGI Altix 450 supercomputer for GE Energy in Greenville, SC tosupport.');

insert into items (title_id, text) values (4,'Deployed a 48 node Dell Linux-based cluster for GE Energy in Schenectady, using LSF as the resource manager.');

insert into items (title_id, text) values (4,'Deployed a 16 node HP Linux-based cluster for development at GE Hydro in Lachine, Canada, using TORQUE as the resource manager.');

insert into items (title_id, text) values (4,'Implemented in Perl scripts that automated the identification and deactivation of UNIX access for invalid users in production NIS and LDAP environments while retaining the UID numbers to ensure the protection of EAR99 license-required data from unauthorized users.');

--Certifications
insert into certifications (name, icon, url) values ('Java Foundations Certified Junior Associate', 'oca.png', 'https://www.youracclaim.com/badges/ea6fb63d-ccdc-4442-bf06-be4467d36276');
insert into certifications (name, icon, url) values ('AWS Certified Cloud Practitioner', 'ccp.png', 'https://www.youracclaim.com/badges/c3679a2c-b013-427e-b16b-0906bd3b7a87');