.class public Lz9/s1;
.super Lz9/w1;
.source ""

# interfaces
.implements Lz9/t;


# instance fields
.field private final o:Z


# direct methods
.method public constructor <init>(Lz9/p1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lz9/w1;-><init>(Z)V

    invoke-virtual {p0, p1}, Lz9/w1;->c0(Lz9/p1;)V

    invoke-direct {p0}, Lz9/s1;->D0()Z

    move-result p1

    iput-boolean p1, p0, Lz9/s1;->o:Z

    return-void
.end method

.method private final D0()Z
    .locals 4

    invoke-virtual {p0}, Lz9/w1;->Y()Lz9/q;

    move-result-object v0

    instance-of v1, v0, Lz9/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lz9/r;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lz9/v1;->D()Lz9/w1;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lz9/w1;->T()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, Lz9/w1;->Y()Lz9/q;

    move-result-object v0

    instance-of v3, v0, Lz9/r;

    if-eqz v3, :cond_3

    check-cast v0, Lz9/r;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lz9/v1;->D()Lz9/w1;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method


# virtual methods
.method public T()Z
    .locals 1

    iget-boolean v0, p0, Lz9/s1;->o:Z

    return v0
.end method

.method public W()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
