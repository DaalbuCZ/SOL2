.class public Ld1/v2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/s2;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Ld1/k2;

.field private final e:Ld1/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/p1<",
            "Ld1/z1;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ld1/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/n<",
            "Ld1/n0;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ld1/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/p1<",
            "Ljava/util/List<",
            "Ld1/n0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final h:Ld1/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/n<",
            "Ld1/d3;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ld1/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/p1<",
            "Ljava/util/List<",
            "Ld1/d3;",
            ">;>;"
        }
    .end annotation
.end field

.field private final j:Ld1/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/n<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ld1/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/p1<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private l:Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/z2<",
            "Ld1/n0;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/z2<",
            "Ld1/d3;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/z2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ld1/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/p1<",
            "Ld1/k3;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ld1/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/r<",
            "Ld1/k3;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ljava/io/File;

.field private r:Ljava/io/File;

.field private final s:Ld1/t;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld1/k2;Ld1/d2;Ld1/x0;Ld1/s0;Ld1/n3;Ld1/g3;Ld1/p1;Ld1/r;Ld1/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ld1/k2;",
            "Ld1/d2;",
            "Ld1/x0;",
            "Ld1/s0;",
            "Ld1/n3;",
            "Ld1/g3;",
            "Ld1/p1<",
            "Ld1/k3;",
            ">;",
            "Ld1/r<",
            "Ld1/k3;",
            ">;",
            "Ld1/t;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld1/p3;

    invoke-direct {v0}, Ld1/p3;-><init>()V

    iput-object v0, p0, Ld1/v2;->j:Ld1/n;

    new-instance v0, Ld1/m3;

    invoke-direct {v0}, Ld1/m3;-><init>()V

    iput-object v0, p0, Ld1/v2;->k:Ld1/p1;

    iput-object p1, p0, Ld1/v2;->c:Landroid/content/Context;

    iput-object p2, p0, Ld1/v2;->d:Ld1/k2;

    iput-object p3, p0, Ld1/v2;->e:Ld1/p1;

    iput-object p4, p0, Ld1/v2;->f:Ld1/n;

    iput-object p5, p0, Ld1/v2;->g:Ld1/p1;

    iput-object p6, p0, Ld1/v2;->h:Ld1/n;

    iput-object p7, p0, Ld1/v2;->i:Ld1/p1;

    iput-object p8, p0, Ld1/v2;->o:Ld1/p1;

    iput-object p9, p0, Ld1/v2;->p:Ld1/r;

    iput-object p10, p0, Ld1/v2;->s:Ld1/t;

    return-void
.end method

.method private r(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 5

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " folder inside the session folder: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " couldn\'t be opened."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Bugfender-SDK"

    invoke-static {p2, p1}, Ld1/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private s([Ljava/io/File;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/io/File;",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance p2, Ld1/v2$b;

    invoke-direct {p2, p0, p1}, Ld1/v2$b;-><init>(Ld1/v2;[Ljava/io/File;)V

    invoke-static {p1, p2}, Ld1/r0;->c([Ljava/io/File;Ld1/r0$a;)V

    return-void

    :cond_0
    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method

.method private t(Ljava/io/File;)J
    .locals 6

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v4, p1, v1

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v4

    goto :goto_1

    :cond_1
    invoke-direct {p0, v4}, Ld1/v2;->t(Ljava/io/File;)J

    move-result-wide v4

    :goto_1
    add-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move-wide v0, v2

    :goto_2
    return-wide v0
.end method

.method private u(J)Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Ld1/v2;->w()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "session-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private v(Ld1/z1;)Ljava/io/File;
    .locals 3

    invoke-virtual {p1}, Ld1/z1;->g()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Ld1/v2;->u(J)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The old session with local-sessionId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ld1/z1;->g()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " couldn\'t be opened."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Bugfender-SDK"

    invoke-static {v0, p1}, Ld1/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private w()Ljava/io/File;
    .locals 3

    iget-object v0, p0, Ld1/v2;->c:Landroid/content/Context;

    const-string v1, "bugfender"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private x()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Ld1/v2;->w()Ljava/io/File;

    move-result-object v1

    const-string v2, "device_status.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld1/z1;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Ld1/v2;->w()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0}, Ld1/v2;->c()Ld1/z1;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    new-instance v3, Ld1/v2$c;

    invoke-direct {v3, p0, v0}, Ld1/v2$c;-><init>(Ld1/v2;[Ljava/io/File;)V

    invoke-static {v0, v3}, Ld1/r0;->c([Ljava/io/File;Ld1/r0$a;)V

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_3

    aget-object v6, v0, v5

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Ld1/z1;->g()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    array-length v8, v7

    move v9, v4

    :goto_1
    if-ge v9, v8, :cond_2

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "session.json"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v11, p0, Ld1/v2;->e:Ld1/p1;

    invoke-interface {v11, v10}, Ld1/p1;->b(Ljava/io/File;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ld1/z1;

    if-eqz v10, :cond_0

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    iget-object v10, p0, Ld1/v2;->s:Ld1/t;

    invoke-static {v6, v10}, Ld1/r0;->d(Ljava/io/File;Ld1/t;)Z

    :cond_1
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public b(Ljava/io/File;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Ld1/v2;->s:Ld1/t;

    invoke-virtual {v2, v0, v1}, Ld1/t;->e(J)V

    :cond_0
    return p1
.end method

.method public c()Ld1/z1;
    .locals 3

    iget-object v0, p0, Ld1/v2;->r:Ljava/io/File;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Ld1/v2;->q:Ljava/io/File;

    const-string v2, "session.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Ld1/v2;->r:Ljava/io/File;

    :cond_0
    iget-object v0, p0, Ld1/v2;->e:Ld1/p1;

    iget-object v1, p0, Ld1/v2;->r:Ljava/io/File;

    invoke-interface {v0, v1}, Ld1/p1;->b(Ljava/io/File;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/z1;

    return-object v0
.end method

.method public c(Ld1/z1;)Ld1/z2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            ")",
            "Ld1/z2<",
            "Ld1/n0;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Ld1/v2;->v(Ld1/z1;)Ljava/io/File;

    move-result-object p1

    const-string v0, "logs"

    invoke-direct {p0, p1, v0}, Ld1/v2;->r(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance p1, Ld1/z2;

    iget-object v2, p0, Ld1/v2;->f:Ld1/n;

    iget-object v3, p0, Ld1/v2;->g:Ld1/p1;

    const-string v5, "logs"

    iget-object v6, p0, Ld1/v2;->s:Ld1/t;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Ld1/z2;-><init>(Ld1/n;Ld1/p1;Ljava/io/File;Ljava/lang/String;Ld1/t;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ld1/e3;

    invoke-direct {v0, p1}, Ld1/e3;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public d()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld1/z1;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ld1/v2;->c()Ld1/z1;

    move-result-object v0

    invoke-virtual {p0}, Ld1/v2;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-object v1
.end method

.method public e()Ld1/k3;
    .locals 2

    iget-object v0, p0, Ld1/v2;->o:Ld1/p1;

    invoke-direct {p0}, Ld1/v2;->x()Ljava/io/File;

    move-result-object v1

    invoke-interface {v0, v1}, Ld1/p1;->b(Ljava/io/File;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/k3;

    return-object v0
.end method

.method public f()Ld1/z2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/z2<",
            "Ld1/d3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/v2;->m:Ld1/z2;

    return-object v0
.end method

.method public f(J)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Ld1/v2;->u(J)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    const-string v0, "crashes"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object p1, p0, Ld1/v2;->s:Ld1/t;

    invoke-static {p2, p1}, Ld1/r0;->f(Ljava/io/File;Ld1/t;)Z

    move-result p1

    return p1
.end method

.method public g()Ld1/z2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/z2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/v2;->n:Ld1/z2;

    return-object v0
.end method

.method public h()J
    .locals 4

    iget-object v0, p0, Ld1/v2;->s:Ld1/t;

    invoke-virtual {v0}, Ld1/t;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ld1/v2;->w()Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Ld1/v2;->s:Ld1/t;

    invoke-direct {p0, v0}, Ld1/v2;->t(Ljava/io/File;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ld1/t;->c(J)V

    :cond_0
    iget-object v0, p0, Ld1/v2;->s:Ld1/t;

    invoke-virtual {v0}, Ld1/t;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public i()Ld1/z2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/z2<",
            "Ld1/n0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/v2;->l:Ld1/z2;

    return-object v0
.end method

.method public j(JLjava/util/Comparator;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ld1/v2;->u(J)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ld1/v2$a;

    invoke-direct {p2, p0}, Ld1/v2$a;-><init>(Ld1/v2;)V

    invoke-virtual {p1, p2}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object p1

    array-length p2, p1

    if-lez p2, :cond_0

    const/4 p2, 0x0

    aget-object p1, p1, p2

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Ld1/v2;->s([Ljava/io/File;Ljava/util/Comparator;)V

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public k(Ld1/z1;)Ld1/z2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            ")",
            "Ld1/z2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Ld1/v2;->v(Ld1/z1;)Ljava/io/File;

    move-result-object p1

    const-string v0, "crashes"

    invoke-direct {p0, p1, v0}, Ld1/v2;->r(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance p1, Ld1/z2;

    iget-object v2, p0, Ld1/v2;->j:Ld1/n;

    iget-object v3, p0, Ld1/v2;->k:Ld1/p1;

    const-string v5, "crashes"

    iget-object v6, p0, Ld1/v2;->s:Ld1/t;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Ld1/z2;-><init>(Ld1/n;Ld1/p1;Ljava/io/File;Ljava/lang/String;Ld1/t;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ld1/e3;

    invoke-direct {v0, p1}, Ld1/e3;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public l(Ld1/k3;)V
    .locals 2

    iget-object v0, p0, Ld1/v2;->p:Ld1/r;

    invoke-direct {p0}, Ld1/v2;->x()Ljava/io/File;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ld1/r;->a(Ljava/lang/Object;Ljava/io/File;)V

    return-void
.end method

.method public m(J)V
    .locals 1

    invoke-virtual {p0}, Ld1/v2;->c()Ld1/z1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ld1/z1;->b(J)V

    iget-object p1, p0, Ld1/v2;->r:Ljava/io/File;

    iget-object p2, p0, Ld1/v2;->d:Ld1/k2;

    invoke-virtual {p2, v0}, Ld1/k2;->d(Ld1/z1;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Ld1/v2;->s:Ld1/t;

    invoke-static {p1, p2, v0}, Ld1/r0;->e(Ljava/io/File;Ljava/lang/String;Ld1/t;)V

    return-void
.end method

.method public n(Ld1/z1;)V
    .locals 14

    invoke-direct {p0}, Ld1/v2;->w()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ld1/z1;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, p0, Ld1/v2;->q:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Ld1/v2;->q:Ljava/io/File;

    const-string v2, "session.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Ld1/v2;->r:Ljava/io/File;

    iget-object v0, p0, Ld1/v2;->d:Ld1/k2;

    invoke-virtual {v0, p1}, Ld1/k2;->d(Ld1/z1;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ld1/v2;->r:Ljava/io/File;

    iget-object v1, p0, Ld1/v2;->s:Ld1/t;

    invoke-static {v0, p1, v1}, Ld1/r0;->b(Ljava/io/File;Ljava/lang/String;Ld1/t;)V

    new-instance v5, Ljava/io/File;

    iget-object p1, p0, Ld1/v2;->q:Ljava/io/File;

    const-string v0, "logs"

    invoke-direct {v5, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->mkdir()Z

    move-result p1

    const-string v0, "Session folder: "

    if-eqz p1, :cond_2

    new-instance p1, Ld1/z2;

    iget-object v3, p0, Ld1/v2;->f:Ld1/n;

    iget-object v4, p0, Ld1/v2;->g:Ld1/p1;

    iget-object v7, p0, Ld1/v2;->s:Ld1/t;

    const-string v6, "logs"

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Ld1/z2;-><init>(Ld1/n;Ld1/p1;Ljava/io/File;Ljava/lang/String;Ld1/t;)V

    iput-object p1, p0, Ld1/v2;->l:Ld1/z2;

    new-instance v11, Ljava/io/File;

    iget-object p1, p0, Ld1/v2;->q:Ljava/io/File;

    const-string v1, "issues"

    invoke-direct {v11, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->mkdir()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ld1/z2;

    iget-object v9, p0, Ld1/v2;->h:Ld1/n;

    iget-object v10, p0, Ld1/v2;->i:Ld1/p1;

    iget-object v13, p0, Ld1/v2;->s:Ld1/t;

    const-string v12, "issues"

    move-object v8, p1

    invoke-direct/range {v8 .. v13}, Ld1/z2;-><init>(Ld1/n;Ld1/p1;Ljava/io/File;Ljava/lang/String;Ld1/t;)V

    iput-object p1, p0, Ld1/v2;->m:Ld1/z2;

    new-instance v3, Ljava/io/File;

    iget-object p1, p0, Ld1/v2;->q:Ljava/io/File;

    const-string v0, "crashes"

    invoke-direct {v3, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ld1/z2;

    iget-object v1, p0, Ld1/v2;->j:Ld1/n;

    iget-object v2, p0, Ld1/v2;->k:Ld1/p1;

    iget-object v5, p0, Ld1/v2;->s:Ld1/t;

    const-string v4, "crashes"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ld1/z2;-><init>(Ld1/n;Ld1/p1;Ljava/io/File;Ljava/lang/String;Ld1/t;)V

    iput-object p1, p0, Ld1/v2;->n:Ld1/z2;

    return-void

    :cond_0
    new-instance p1, Ld1/a1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Crashes folder: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " couldn\'t create the crashes folder."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ld1/a1;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ld1/a1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld1/v2;->q:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " couldn\'t create the issue folder."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ld1/a1;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ld1/a1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld1/v2;->q:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " couldn\'t create the log folder."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ld1/a1;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ld1/a1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Session with name: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " couldn\'t create the session folder."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ld1/a1;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ld1/a1;

    const-string v0, "Bugfender folder doesn\'t exist and it couldn\'t be created"

    invoke-direct {p1, v0}, Ld1/a1;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o(Ld1/z1;)Ld1/z2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            ")",
            "Ld1/z2<",
            "Ld1/d3;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Ld1/v2;->v(Ld1/z1;)Ljava/io/File;

    move-result-object p1

    const-string v0, "issues"

    invoke-direct {p0, p1, v0}, Ld1/v2;->r(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance p1, Ld1/z2;

    iget-object v2, p0, Ld1/v2;->h:Ld1/n;

    iget-object v3, p0, Ld1/v2;->i:Ld1/p1;

    const-string v5, "issues"

    iget-object v6, p0, Ld1/v2;->s:Ld1/t;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Ld1/z2;-><init>(Ld1/n;Ld1/p1;Ljava/io/File;Ljava/lang/String;Ld1/t;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ld1/e3;

    invoke-direct {v0, p1}, Ld1/e3;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public p(JJ)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ld1/v2;->u(J)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    const-string v0, "session.json"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object p1, p0, Ld1/v2;->e:Ld1/p1;

    invoke-interface {p1, p2}, Ld1/p1;->b(Ljava/io/File;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/z1;

    invoke-virtual {p1, p3, p4}, Ld1/z1;->b(J)V

    iget-object p3, p0, Ld1/v2;->d:Ld1/k2;

    invoke-virtual {p3, p1}, Ld1/k2;->d(Ld1/z1;)Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Ld1/v2;->s:Ld1/t;

    invoke-static {p2, p1, p3}, Ld1/r0;->e(Ljava/io/File;Ljava/lang/String;Ld1/t;)V

    return-void
.end method

.method public q(J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Ld1/v2;->u(J)Ljava/io/File;

    move-result-object p1

    iget-object p2, p0, Ld1/v2;->s:Ld1/t;

    invoke-static {p1, p2}, Ld1/r0;->d(Ljava/io/File;Ld1/t;)Z

    move-result p1

    return p1
.end method
