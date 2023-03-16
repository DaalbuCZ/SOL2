.class public Ls1/u1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/u1$d$a;
    }
.end annotation


# static fields
.field public static final s:Ls1/u1$d;

.field public static final t:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/u1$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:J

.field public final o:J

.field public final p:Z

.field public final q:Z

.field public final r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/u1$d$a;

    invoke-direct {v0}, Ls1/u1$d$a;-><init>()V

    invoke-virtual {v0}, Ls1/u1$d$a;->f()Ls1/u1$d;

    move-result-object v0

    sput-object v0, Ls1/u1$d;->s:Ls1/u1$d;

    sget-object v0, Ls1/v1;->a:Ls1/v1;

    sput-object v0, Ls1/u1$d;->t:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(Ls1/u1$d$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls1/u1$d$a;->a(Ls1/u1$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Ls1/u1$d;->n:J

    invoke-static {p1}, Ls1/u1$d$a;->b(Ls1/u1$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Ls1/u1$d;->o:J

    invoke-static {p1}, Ls1/u1$d$a;->c(Ls1/u1$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ls1/u1$d;->p:Z

    invoke-static {p1}, Ls1/u1$d$a;->d(Ls1/u1$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ls1/u1$d;->q:Z

    invoke-static {p1}, Ls1/u1$d$a;->e(Ls1/u1$d$a;)Z

    move-result p1

    iput-boolean p1, p0, Ls1/u1$d;->r:Z

    return-void
.end method

.method synthetic constructor <init>(Ls1/u1$d$a;Ls1/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/u1$d;-><init>(Ls1/u1$d$a;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/u1$e;
    .locals 0

    invoke-static {p0}, Ls1/u1$d;->d(Landroid/os/Bundle;)Ls1/u1$e;

    move-result-object p0

    return-object p0
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Landroid/os/Bundle;)Ls1/u1$e;
    .locals 5

    new-instance v0, Ls1/u1$d$a;

    invoke-direct {v0}, Ls1/u1$d$a;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ls1/u1$d;->c(I)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    invoke-virtual {p0, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ls1/u1$d$a;->k(J)Ls1/u1$d$a;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2}, Ls1/u1$d;->c(I)Ljava/lang/String;

    move-result-object v2

    const-wide/high16 v3, -0x8000000000000000L

    invoke-virtual {p0, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ls1/u1$d$a;->h(J)Ls1/u1$d$a;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v2}, Ls1/u1$d;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v2}, Ls1/u1$d$a;->j(Z)Ls1/u1$d$a;

    move-result-object v0

    const/4 v2, 0x3

    invoke-static {v2}, Ls1/u1$d;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v2}, Ls1/u1$d$a;->i(Z)Ls1/u1$d$a;

    move-result-object v0

    const/4 v2, 0x4

    invoke-static {v2}, Ls1/u1$d;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-virtual {v0, p0}, Ls1/u1$d$a;->l(Z)Ls1/u1$d$a;

    move-result-object p0

    invoke-virtual {p0}, Ls1/u1$d$a;->g()Ls1/u1$e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ls1/u1$d$a;
    .locals 2

    new-instance v0, Ls1/u1$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/u1$d$a;-><init>(Ls1/u1$d;Ls1/u1$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls1/u1$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls1/u1$d;

    iget-wide v3, p0, Ls1/u1$d;->n:J

    iget-wide v5, p1, Ls1/u1$d;->n:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ls1/u1$d;->o:J

    iget-wide v5, p1, Ls1/u1$d;->o:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ls1/u1$d;->p:Z

    iget-boolean v3, p1, Ls1/u1$d;->p:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ls1/u1$d;->q:Z

    iget-boolean v3, p1, Ls1/u1$d;->q:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ls1/u1$d;->r:Z

    iget-boolean p1, p1, Ls1/u1$d;->r:Z

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Ls1/u1$d;->n:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Ls1/u1$d;->o:J

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls1/u1$d;->p:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls1/u1$d;->q:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls1/u1$d;->r:Z

    add-int/2addr v0, v1

    return v0
.end method
