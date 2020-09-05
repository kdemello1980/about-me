CREATE TABLE employers(
    eid SERIAL,
    name VARCHAR(255),
    PRIMARY KEY(eid)
);

CREATE TABLE titles(
    tid SERIAL,
    name VARCHAR(255),
    employer_id INTEGER,
    PRIMARY KEY(tid),
    FOREIGN KEY (employer_id) REFERENCES employers(eid)
);

CREATE TABLE items(
    item_id SERIAL,
    title_id INTEGER,
    text TEXT,
    PRIMARY KEY(item_id),
    FOREIGN KEY (title_id) REFERENCES titles(tid)
);
