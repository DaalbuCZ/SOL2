.class public final Le3/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/l;


# static fields
.field private static final g:Ljava/util/regex/Pattern;

.field private static final h:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lu3/j0;

.field private final c:Lu3/a0;

.field private d:Lc2/n;

.field private e:[B

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "LOCAL:([^,]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Le3/t;->g:Ljava/util/regex/Pattern;

    const-string v0, "MPEGTS:(-?\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Le3/t;->h:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lu3/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/t;->a:Ljava/lang/String;

    iput-object p2, p0, Le3/t;->b:Lu3/j0;

    new-instance p1, Lu3/a0;

    invoke-direct {p1}, Lu3/a0;-><init>()V

    iput-object p1, p0, Le3/t;->c:Lu3/a0;

    const/16 p1, 0x400

    new-array p1, p1, [B

    iput-object p1, p0, Le3/t;->e:[B

    return-void
.end method

.method private d(J)Lc2/e0;
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    iget-object v0, p0, Le3/t;->d:Lc2/n;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lc2/n;->d(II)Lc2/e0;

    move-result-object v0

    new-instance v1, Lx1/n1$b;

    invoke-direct {v1}, Lx1/n1$b;-><init>()V

    const-string v2, "text/vtt"

    invoke-virtual {v1, v2}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v1

    iget-object v2, p0, Le3/t;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lx1/n1$b;->X(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lx1/n1$b;->k0(J)Lx1/n1$b;

    move-result-object p1

    invoke-virtual {p1}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object p1

    invoke-interface {v0, p1}, Lc2/e0;->a(Lx1/n1;)V

    iget-object p1, p0, Le3/t;->d:Lc2/n;

    invoke-interface {p1}, Lc2/n;->i()V

    return-object v0
.end method

.method private e()V
    .locals 12
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    new-instance v0, Lu3/a0;

    iget-object v1, p0, Le3/t;->e:[B

    invoke-direct {v0, v1}, Lu3/a0;-><init>([B)V

    invoke-static {v0}, Lr3/i;->e(Lu3/a0;)V

    invoke-virtual {v0}, Lu3/a0;->p()Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x0

    move-wide v4, v2

    move-wide v6, v4

    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    const/4 v9, 0x1

    if-nez v8, :cond_3

    const-string v8, "X-TIMESTAMP-MAP"

    invoke-virtual {v1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    sget-object v4, Le3/t;->g:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    sget-object v5, Le3/t;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lr3/i;->d(Ljava/lang/String;)J

    move-result-wide v6

    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lu3/j0;->f(J)J

    move-result-wide v4

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object v0

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object v0

    throw v0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Lu3/a0;->p()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lr3/i;->a(Lu3/a0;)Ljava/util/regex/Matcher;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-direct {p0, v2, v3}, Le3/t;->d(J)Lc2/e0;

    return-void

    :cond_4
    invoke-virtual {v0, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lr3/i;->d(Ljava/lang/String;)J

    move-result-wide v0

    iget-object v2, p0, Le3/t;->b:Lu3/j0;

    add-long/2addr v4, v0

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Lu3/j0;->j(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lu3/j0;->b(J)J

    move-result-wide v6

    sub-long v0, v6, v0

    invoke-direct {p0, v0, v1}, Le3/t;->d(J)Lc2/e0;

    move-result-object v5

    iget-object v0, p0, Le3/t;->c:Lu3/a0;

    iget-object v1, p0, Le3/t;->e:[B

    iget v2, p0, Le3/t;->f:I

    invoke-virtual {v0, v1, v2}, Lu3/a0;->P([BI)V

    iget-object v0, p0, Le3/t;->c:Lu3/a0;

    iget v1, p0, Le3/t;->f:I

    invoke-interface {v5, v0, v1}, Lc2/e0;->b(Lu3/a0;I)V

    const/4 v8, 0x1

    iget v9, p0, Le3/t;->f:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-interface/range {v5 .. v11}, Lc2/e0;->e(JIIILc2/e0$a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public c(Lc2/n;)V
    .locals 3

    iput-object p1, p0, Le3/t;->d:Lc2/n;

    new-instance v0, Lc2/b0$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lc2/b0$b;-><init>(J)V

    invoke-interface {p1, v0}, Lc2/n;->p(Lc2/b0;)V

    return-void
.end method

.method public g(Lc2/m;Lc2/a0;)I
    .locals 4

    iget-object p2, p0, Le3/t;->d:Lc2/n;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lc2/m;->a()J

    move-result-wide v0

    long-to-int p2, v0

    iget v0, p0, Le3/t;->f:I

    iget-object v1, p0, Le3/t;->e:[B

    array-length v2, v1

    const/4 v3, -0x1

    if-ne v0, v2, :cond_1

    if-eq p2, v3, :cond_0

    move v0, p2

    goto :goto_0

    :cond_0
    array-length v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Le3/t;->e:[B

    :cond_1
    iget-object v0, p0, Le3/t;->e:[B

    iget v1, p0, Le3/t;->f:I

    array-length v2, v0

    sub-int/2addr v2, v1

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->b([BII)I

    move-result p1

    if-eq p1, v3, :cond_3

    iget v0, p0, Le3/t;->f:I

    add-int/2addr v0, p1

    iput v0, p0, Le3/t;->f:I

    if-eq p2, v3, :cond_2

    if-eq v0, p2, :cond_3

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    invoke-direct {p0}, Le3/t;->e()V

    return v3
.end method

.method public j(Lc2/m;)Z
    .locals 4

    iget-object v0, p0, Le3/t;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-interface {p1, v0, v1, v2, v1}, Lc2/m;->m([BIIZ)Z

    iget-object v0, p0, Le3/t;->c:Lu3/a0;

    iget-object v3, p0, Le3/t;->e:[B

    invoke-virtual {v0, v3, v2}, Lu3/a0;->P([BI)V

    iget-object v0, p0, Le3/t;->c:Lu3/a0;

    invoke-static {v0}, Lr3/i;->b(Lu3/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Le3/t;->e:[B

    const/4 v3, 0x3

    invoke-interface {p1, v0, v2, v3, v1}, Lc2/m;->m([BIIZ)Z

    iget-object p1, p0, Le3/t;->c:Lu3/a0;

    iget-object v0, p0, Le3/t;->e:[B

    const/16 v1, 0x9

    invoke-virtual {p1, v0, v1}, Lu3/a0;->P([BI)V

    iget-object p1, p0, Le3/t;->c:Lu3/a0;

    invoke-static {p1}, Lr3/i;->b(Lu3/a0;)Z

    move-result p1

    return p1
.end method
