.class Lw1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw1/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/g$d;,
        Lw1/g$c;,
        Lw1/g$e;,
        Lw1/g$b;,
        Lw1/g$a;,
        Lw1/g$f;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw1/m$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lw1/g0;

.field private final c:Lw1/g$a;

.field private final d:Lw1/g$b;

.field private final e:I

.field private final f:Z

.field private final g:Z

.field private final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lp3/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp3/i<",
            "Lw1/w$a;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lo3/g0;

.field private final k:Lt1/t1;

.field final l:Lw1/n0;

.field final m:Ljava/util/UUID;

.field final n:Lw1/g$e;

.field private o:I

.field private p:I

.field private q:Landroid/os/HandlerThread;

.field private r:Lw1/g$c;

.field private s:Lv1/b;

.field private t:Lw1/o$a;

.field private u:[B

.field private v:[B

.field private w:Lw1/g0$a;

.field private x:Lw1/g0$d;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lw1/g0;Lw1/g$a;Lw1/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lw1/n0;Landroid/os/Looper;Lo3/g0;Lt1/t1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lw1/g0;",
            "Lw1/g$a;",
            "Lw1/g$b;",
            "Ljava/util/List<",
            "Lw1/m$b;",
            ">;IZZ[B",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lw1/n0;",
            "Landroid/os/Looper;",
            "Lo3/g0;",
            "Lt1/t1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-eq p6, v0, :cond_0

    const/4 v0, 0x3

    if-ne p6, v0, :cond_1

    :cond_0
    invoke-static {p9}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput-object p1, p0, Lw1/g;->m:Ljava/util/UUID;

    iput-object p3, p0, Lw1/g;->c:Lw1/g$a;

    iput-object p4, p0, Lw1/g;->d:Lw1/g$b;

    iput-object p2, p0, Lw1/g;->b:Lw1/g0;

    iput p6, p0, Lw1/g;->e:I

    iput-boolean p7, p0, Lw1/g;->f:Z

    iput-boolean p8, p0, Lw1/g;->g:Z

    if-eqz p9, :cond_2

    iput-object p9, p0, Lw1/g;->v:[B

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    invoke-static {p5}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lw1/g;->a:Ljava/util/List;

    iput-object p10, p0, Lw1/g;->h:Ljava/util/HashMap;

    iput-object p11, p0, Lw1/g;->l:Lw1/n0;

    new-instance p1, Lp3/i;

    invoke-direct {p1}, Lp3/i;-><init>()V

    iput-object p1, p0, Lw1/g;->i:Lp3/i;

    iput-object p13, p0, Lw1/g;->j:Lo3/g0;

    iput-object p14, p0, Lw1/g;->k:Lt1/t1;

    const/4 p1, 0x2

    iput p1, p0, Lw1/g;->o:I

    new-instance p1, Lw1/g$e;

    invoke-direct {p1, p0, p12}, Lw1/g$e;-><init>(Lw1/g;Landroid/os/Looper;)V

    iput-object p1, p0, Lw1/g;->n:Lw1/g$e;

    return-void
.end method

.method private C(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw1/g;->x:Lw1/g0$d;

    if-ne p1, v0, :cond_2

    iget p1, p0, Lw1/g;->o:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Lw1/g;->s()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lw1/g;->x:Lw1/g0$d;

    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lw1/g;->c:Lw1/g$a;

    check-cast p2, Ljava/lang/Exception;

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lw1/g$a;->c(Ljava/lang/Exception;Z)V

    return-void

    :cond_1
    :try_start_0
    iget-object p1, p0, Lw1/g;->b:Lw1/g0;

    check-cast p2, [B

    invoke-interface {p1, p2}, Lw1/g0;->i([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lw1/g;->c:Lw1/g$a;

    invoke-interface {p1}, Lw1/g$a;->b()V

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lw1/g;->c:Lw1/g$a;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Lw1/g$a;->c(Ljava/lang/Exception;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method private D()Z
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sessionId"
        }
        result = true
    .end annotation

    invoke-direct {p0}, Lw1/g;->s()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw1/g;->b:Lw1/g0;

    invoke-interface {v0}, Lw1/g0;->n()[B

    move-result-object v0

    iput-object v0, p0, Lw1/g;->u:[B

    iget-object v2, p0, Lw1/g;->b:Lw1/g0;

    iget-object v3, p0, Lw1/g;->k:Lt1/t1;

    invoke-interface {v2, v0, v3}, Lw1/g0;->f([BLt1/t1;)V

    iget-object v0, p0, Lw1/g;->b:Lw1/g0;

    iget-object v2, p0, Lw1/g;->u:[B

    invoke-interface {v0, v2}, Lw1/g0;->m([B)Lv1/b;

    move-result-object v0

    iput-object v0, p0, Lw1/g;->s:Lv1/b;

    const/4 v0, 0x3

    iput v0, p0, Lw1/g;->o:I

    new-instance v2, Lw1/b;

    invoke-direct {v2, v0}, Lw1/b;-><init>(I)V

    invoke-direct {p0, v2}, Lw1/g;->o(Lp3/h;)V

    iget-object v0, p0, Lw1/g;->u:[B

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/media/NotProvisionedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    invoke-direct {p0, v0, v1}, Lw1/g;->v(Ljava/lang/Exception;I)V

    goto :goto_0

    :catch_1
    iget-object v0, p0, Lw1/g;->c:Lw1/g$a;

    invoke-interface {v0, p0}, Lw1/g$a;->a(Lw1/g;)V

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private E([BIZ)V
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lw1/g;->b:Lw1/g0;

    iget-object v2, p0, Lw1/g;->a:Ljava/util/List;

    iget-object v3, p0, Lw1/g;->h:Ljava/util/HashMap;

    invoke-interface {v1, p1, v2, p2, v3}, Lw1/g0;->j([BLjava/util/List;ILjava/util/HashMap;)Lw1/g0$a;

    move-result-object p1

    iput-object p1, p0, Lw1/g;->w:Lw1/g0$a;

    iget-object p1, p0, Lw1/g;->r:Lw1/g$c;

    invoke-static {p1}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw1/g$c;

    iget-object p2, p0, Lw1/g;->w:Lw1/g0$a;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, v0, p2, p3}, Lw1/g$c;->b(ILjava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1, v0}, Lw1/g;->x(Ljava/lang/Exception;Z)V

    :goto_0
    return-void
.end method

.method private G()Z
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sessionId",
            "offlineLicenseKeySetId"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lw1/g;->b:Lw1/g0;

    iget-object v2, p0, Lw1/g;->u:[B

    iget-object v3, p0, Lw1/g;->v:[B

    invoke-interface {v1, v2, v3}, Lw1/g0;->c([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    invoke-direct {p0, v1, v0}, Lw1/g;->v(Ljava/lang/Exception;I)V

    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic j(Ljava/lang/Exception;Lw1/w$a;)V
    .locals 0

    invoke-static {p0, p1}, Lw1/g;->t(Ljava/lang/Exception;Lw1/w$a;)V

    return-void
.end method

.method public static synthetic k(ILw1/w$a;)V
    .locals 0

    invoke-static {p0, p1}, Lw1/g;->u(ILw1/w$a;)V

    return-void
.end method

.method static synthetic l(Lw1/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw1/g;->C(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic m(Lw1/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw1/g;->w(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic n(Lw1/g;)Lo3/g0;
    .locals 0

    iget-object p0, p0, Lw1/g;->j:Lo3/g0;

    return-object p0
.end method

.method private o(Lp3/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp3/h<",
            "Lw1/w$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lw1/g;->i:Lp3/i;

    invoke-virtual {v0}, Lp3/i;->n()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/w$a;

    invoke-interface {p1, v1}, Lp3/h;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private p(Z)V
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sessionId"
        }
    .end annotation

    iget-boolean v0, p0, Lw1/g;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw1/g;->u:[B

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iget v1, p0, Lw1/g;->e:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_4

    if-eq v1, v3, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v1, p0, Lw1/g;->v:[B

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lw1/g;->u:[B

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lw1/g;->v:[B

    invoke-direct {p0, v1, v0, p1}, Lw1/g;->E([BIZ)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lw1/g;->v:[B

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lw1/g;->G()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_3
    :goto_0
    invoke-direct {p0, v0, v3, p1}, Lw1/g;->E([BIZ)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lw1/g;->v:[B

    if-nez v1, :cond_5

    invoke-direct {p0, v0, v2, p1}, Lw1/g;->E([BIZ)V

    goto :goto_1

    :cond_5
    iget v1, p0, Lw1/g;->o:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_6

    invoke-direct {p0}, Lw1/g;->G()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_6
    invoke-direct {p0}, Lw1/g;->q()J

    move-result-wide v4

    iget v1, p0, Lw1/g;->e:I

    if-nez v1, :cond_7

    const-wide/16 v6, 0x3c

    cmp-long v1, v4, v6

    if-gtz v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Offline license has expired or will expire soon. Remaining seconds: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v1}, Lp3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    const-wide/16 v0, 0x0

    cmp-long p1, v4, v0

    if-gtz p1, :cond_8

    new-instance p1, Lw1/m0;

    invoke-direct {p1}, Lw1/m0;-><init>()V

    invoke-direct {p0, p1, v3}, Lw1/g;->v(Ljava/lang/Exception;I)V

    goto :goto_1

    :cond_8
    iput v2, p0, Lw1/g;->o:I

    sget-object p1, Lw1/f;->a:Lw1/f;

    invoke-direct {p0, p1}, Lw1/g;->o(Lp3/h;)V

    :cond_9
    :goto_1
    return-void
.end method

.method private q()J
    .locals 5

    sget-object v0, Ls1/i;->d:Ljava/util/UUID;

    iget-object v1, p0, Lw1/g;->m:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    invoke-static {p0}, Lw1/q0;->b(Lw1/o;)Landroid/util/Pair;

    move-result-object v0

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private s()Z
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sessionId"
        }
        result = true
    .end annotation

    iget v0, p0, Lw1/g;->o:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private static synthetic t(Ljava/lang/Exception;Lw1/w$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lw1/w$a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic u(ILw1/w$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lw1/w$a;->k(I)V

    return-void
.end method

.method private v(Ljava/lang/Exception;I)V
    .locals 1

    new-instance v0, Lw1/o$a;

    invoke-static {p1, p2}, Lw1/c0;->a(Ljava/lang/Exception;I)I

    move-result p2

    invoke-direct {v0, p1, p2}, Lw1/o$a;-><init>(Ljava/lang/Throwable;I)V

    iput-object v0, p0, Lw1/g;->t:Lw1/o$a;

    const-string p2, "DefaultDrmSession"

    const-string v0, "DRM session error"

    invoke-static {p2, v0, p1}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Lw1/c;

    invoke-direct {p2, p1}, Lw1/c;-><init>(Ljava/lang/Exception;)V

    invoke-direct {p0, p2}, Lw1/g;->o(Lp3/h;)V

    iget p1, p0, Lw1/g;->o:I

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lw1/g;->o:I

    :cond_0
    return-void
.end method

.method private w(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw1/g;->w:Lw1/g0$a;

    if-ne p1, v0, :cond_5

    invoke-direct {p0}, Lw1/g;->s()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lw1/g;->w:Lw1/g0$a;

    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    check-cast p2, Ljava/lang/Exception;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Lw1/g;->x(Ljava/lang/Exception;Z)V

    return-void

    :cond_1
    :try_start_0
    check-cast p2, [B

    iget p1, p0, Lw1/g;->e:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lw1/g;->b:Lw1/g0;

    iget-object v0, p0, Lw1/g;->v:[B

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-interface {p1, v0, p2}, Lw1/g0;->g([B[B)[B

    sget-object p1, Lw1/e;->a:Lw1/e;

    :goto_0
    invoke-direct {p0, p1}, Lw1/g;->o(Lp3/h;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lw1/g;->b:Lw1/g0;

    iget-object v0, p0, Lw1/g;->u:[B

    invoke-interface {p1, v0, p2}, Lw1/g0;->g([B[B)[B

    move-result-object p1

    iget p2, p0, Lw1/g;->e:I

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    if-nez p2, :cond_4

    iget-object p2, p0, Lw1/g;->v:[B

    if-eqz p2, :cond_4

    :cond_3
    if-eqz p1, :cond_4

    array-length p2, p1

    if-eqz p2, :cond_4

    iput-object p1, p0, Lw1/g;->v:[B

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, Lw1/g;->o:I

    sget-object p1, Lw1/d;->a:Lw1/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lw1/g;->x(Ljava/lang/Exception;Z)V

    :cond_5
    :goto_1
    return-void
.end method

.method private x(Ljava/lang/Exception;Z)V
    .locals 1

    instance-of v0, p1, Landroid/media/NotProvisionedException;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lw1/g;->c:Lw1/g$a;

    invoke-interface {p1, p0}, Lw1/g$a;->a(Lw1/g;)V

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    :goto_0
    invoke-direct {p0, p1, p2}, Lw1/g;->v(Ljava/lang/Exception;I)V

    :goto_1
    return-void
.end method

.method private y()V
    .locals 2

    iget v0, p0, Lw1/g;->e:I

    if-nez v0, :cond_0

    iget v0, p0, Lw1/g;->o:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw1/g;->u:[B

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw1/g;->p(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    invoke-direct {p0}, Lw1/g;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw1/g;->p(Z)V

    :cond_0
    return-void
.end method

.method public B(Ljava/lang/Exception;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    :goto_0
    invoke-direct {p0, p1, p2}, Lw1/g;->v(Ljava/lang/Exception;I)V

    return-void
.end method

.method public F()V
    .locals 4

    iget-object v0, p0, Lw1/g;->b:Lw1/g0;

    invoke-interface {v0}, Lw1/g0;->h()Lw1/g0$d;

    move-result-object v0

    iput-object v0, p0, Lw1/g;->x:Lw1/g0$d;

    iget-object v0, p0, Lw1/g;->r:Lw1/g$c;

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/g$c;

    iget-object v1, p0, Lw1/g;->x:Lw1/g0$d;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lw1/g$c;->b(ILjava/lang/Object;Z)V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lw1/g;->f:Z

    return v0
.end method

.method public b()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw1/g;->u:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lw1/g;->b:Lw1/g0;

    invoke-interface {v1, v0}, Lw1/g0;->d([B)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public c(Lw1/w$a;)V
    .locals 3

    iget v0, p0, Lw1/g;->p:I

    if-gtz v0, :cond_0

    const-string p1, "DefaultDrmSession"

    const-string v0, "release() called on a session that\'s already fully released."

    invoke-static {p1, v0}, Lp3/r;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lw1/g;->p:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput v0, p0, Lw1/g;->o:I

    iget-object v0, p0, Lw1/g;->n:Lw1/g$e;

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/g$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lw1/g;->r:Lw1/g$c;

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/g$c;

    invoke-virtual {v0}, Lw1/g$c;->c()V

    iput-object v1, p0, Lw1/g;->r:Lw1/g$c;

    iget-object v0, p0, Lw1/g;->q:Landroid/os/HandlerThread;

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    iput-object v1, p0, Lw1/g;->q:Landroid/os/HandlerThread;

    iput-object v1, p0, Lw1/g;->s:Lv1/b;

    iput-object v1, p0, Lw1/g;->t:Lw1/o$a;

    iput-object v1, p0, Lw1/g;->w:Lw1/g0$a;

    iput-object v1, p0, Lw1/g;->x:Lw1/g0$d;

    iget-object v0, p0, Lw1/g;->u:[B

    if-eqz v0, :cond_1

    iget-object v2, p0, Lw1/g;->b:Lw1/g0;

    invoke-interface {v2, v0}, Lw1/g0;->e([B)V

    iput-object v1, p0, Lw1/g;->u:[B

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lw1/g;->i:Lp3/i;

    invoke-virtual {v0, p1}, Lp3/i;->h(Ljava/lang/Object;)V

    iget-object v0, p0, Lw1/g;->i:Lp3/i;

    invoke-virtual {v0, p1}, Lp3/i;->g(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lw1/w$a;->m()V

    :cond_2
    iget-object p1, p0, Lw1/g;->d:Lw1/g$b;

    iget v0, p0, Lw1/g;->p:I

    invoke-interface {p1, p0, v0}, Lw1/g$b;->a(Lw1/g;I)V

    return-void
.end method

.method public final d()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lw1/g;->m:Ljava/util/UUID;

    return-object v0
.end method

.method public e(Lw1/w$a;)V
    .locals 3

    iget v0, p0, Lw1/g;->p:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Session reference count less than zero: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lw1/g;->p:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v0}, Lp3/r;->c(Ljava/lang/String;Ljava/lang/String;)V

    iput v1, p0, Lw1/g;->p:I

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lw1/g;->i:Lp3/i;

    invoke-virtual {v0, p1}, Lp3/i;->d(Ljava/lang/Object;)V

    :cond_1
    iget v0, p0, Lw1/g;->p:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Lw1/g;->p:I

    if-ne v0, v2, :cond_3

    iget p1, p0, Lw1/g;->o:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, Lp3/a;->f(Z)V

    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "ExoPlayer:DrmRequestHandler"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lw1/g;->q:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    new-instance p1, Lw1/g$c;

    iget-object v0, p0, Lw1/g;->q:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lw1/g$c;-><init>(Lw1/g;Landroid/os/Looper;)V

    iput-object p1, p0, Lw1/g;->r:Lw1/g$c;

    invoke-direct {p0}, Lw1/g;->D()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0, v2}, Lw1/g;->p(Z)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    invoke-direct {p0}, Lw1/g;->s()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lw1/g;->i:Lp3/i;

    invoke-virtual {v0, p1}, Lp3/i;->g(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v2, :cond_4

    iget v0, p0, Lw1/g;->o:I

    invoke-virtual {p1, v0}, Lw1/w$a;->k(I)V

    :cond_4
    :goto_0
    iget-object p1, p0, Lw1/g;->d:Lw1/g$b;

    iget v0, p0, Lw1/g;->p:I

    invoke-interface {p1, p0, v0}, Lw1/g$b;->b(Lw1/g;I)V

    return-void
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lw1/g;->o:I

    return v0
.end method

.method public g(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lw1/g;->b:Lw1/g0;

    iget-object v1, p0, Lw1/g;->u:[B

    invoke-static {v1}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-interface {v0, v1, p1}, Lw1/g0;->b([BLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final h()Lw1/o$a;
    .locals 2

    iget v0, p0, Lw1/g;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw1/g;->t:Lw1/o$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final i()Lv1/b;
    .locals 1

    iget-object v0, p0, Lw1/g;->s:Lv1/b;

    return-object v0
.end method

.method public r([B)Z
    .locals 1

    iget-object v0, p0, Lw1/g;->u:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public z(I)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lw1/g;->y()V

    :goto_0
    return-void
.end method
