.class final Le3/p$d;
.super Lz2/m0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le3/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final H:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;"
        }
    .end annotation
.end field

.field private I:Lb2/m;


# direct methods
.method private constructor <init>(Lt3/b;Lb2/y;Lb2/w$a;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/b;",
            "Lb2/y;",
            "Lb2/w$a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lz2/m0;-><init>(Lt3/b;Lb2/y;Lb2/w$a;)V

    iput-object p4, p0, Le3/p$d;->H:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lt3/b;Lb2/y;Lb2/w$a;Ljava/util/Map;Le3/p$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Le3/p$d;-><init>(Lt3/b;Lb2/y;Lb2/w$a;Ljava/util/Map;)V

    return-void
.end method

.method private h0(Lp2/a;)Lp2/a;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lp2/a;->e()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, -0x1

    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Lp2/a;->d(I)Lp2/a$b;

    move-result-object v5

    instance-of v6, v5, Lu2/l;

    if-eqz v6, :cond_1

    check-cast v5, Lu2/l;

    iget-object v5, v5, Lu2/l;->o:Ljava/lang/String;

    const-string v6, "com.apple.streaming.transportStreamTimestamp"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move v3, v4

    :goto_1
    if-ne v3, v4, :cond_3

    return-object p1

    :cond_3
    const/4 v4, 0x1

    if-ne v1, v4, :cond_4

    return-object v0

    :cond_4
    add-int/lit8 v0, v1, -0x1

    new-array v0, v0, [Lp2/a$b;

    :goto_2
    if-ge v2, v1, :cond_7

    if-eq v2, v3, :cond_6

    if-ge v2, v3, :cond_5

    move v4, v2

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v2, -0x1

    :goto_3
    invoke-virtual {p1, v2}, Lp2/a;->d(I)Lp2/a$b;

    move-result-object v5

    aput-object v5, v0, v4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    new-instance p1, Lp2/a;

    invoke-direct {p1, v0}, Lp2/a;-><init>([Lp2/a$b;)V

    return-object p1
.end method


# virtual methods
.method public e(JIIILc2/e0$a;)V
    .locals 0

    invoke-super/range {p0 .. p6}, Lz2/m0;->e(JIIILc2/e0$a;)V

    return-void
.end method

.method public i0(Lb2/m;)V
    .locals 0

    iput-object p1, p0, Le3/p$d;->I:Lb2/m;

    invoke-virtual {p0}, Lz2/m0;->I()V

    return-void
.end method

.method public j0(Le3/i;)V
    .locals 0

    iget p1, p1, Le3/i;->k:I

    invoke-virtual {p0, p1}, Lz2/m0;->f0(I)V

    return-void
.end method

.method public w(Lx1/n1;)Lx1/n1;
    .locals 3

    iget-object v0, p0, Le3/p$d;->I:Lb2/m;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lx1/n1;->B:Lb2/m;

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Le3/p$d;->H:Ljava/util/Map;

    iget-object v2, v0, Lb2/m;->p:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/m;

    if-eqz v1, :cond_1

    move-object v0, v1

    :cond_1
    iget-object v1, p1, Lx1/n1;->w:Lp2/a;

    invoke-direct {p0, v1}, Le3/p$d;->h0(Lp2/a;)Lp2/a;

    move-result-object v1

    iget-object v2, p1, Lx1/n1;->B:Lb2/m;

    if-ne v0, v2, :cond_2

    iget-object v2, p1, Lx1/n1;->w:Lp2/a;

    if-eq v1, v2, :cond_3

    :cond_2
    invoke-virtual {p1}, Lx1/n1;->b()Lx1/n1$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lx1/n1$b;->O(Lb2/m;)Lx1/n1$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lx1/n1$b;->Z(Lp2/a;)Lx1/n1$b;

    move-result-object p1

    invoke-virtual {p1}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object p1

    :cond_3
    invoke-super {p0, p1}, Lz2/m0;->w(Lx1/n1;)Lx1/n1;

    move-result-object p1

    return-object p1
.end method
