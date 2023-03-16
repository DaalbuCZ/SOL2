.class public final Ls1/u1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/u1$j;,
        Ls1/u1$e;,
        Ls1/u1$d;,
        Ls1/u1$k;,
        Ls1/u1$l;,
        Ls1/u1$g;,
        Ls1/u1$i;,
        Ls1/u1$h;,
        Ls1/u1$b;,
        Ls1/u1$f;,
        Ls1/u1$c;
    }
.end annotation


# static fields
.field public static final v:Ls1/u1;

.field public static final w:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/u1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Ljava/lang/String;

.field public final o:Ls1/u1$h;

.field public final p:Ls1/u1$i;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final q:Ls1/u1$g;

.field public final r:Ls1/z1;

.field public final s:Ls1/u1$d;

.field public final t:Ls1/u1$e;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final u:Ls1/u1$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/u1$c;

    invoke-direct {v0}, Ls1/u1$c;-><init>()V

    invoke-virtual {v0}, Ls1/u1$c;->a()Ls1/u1;

    move-result-object v0

    sput-object v0, Ls1/u1;->v:Ls1/u1;

    sget-object v0, Ls1/t1;->a:Ls1/t1;

    sput-object v0, Ls1/u1;->w:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ls1/u1$e;Ls1/u1$i;Ls1/u1$g;Ls1/z1;Ls1/u1$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/u1;->n:Ljava/lang/String;

    iput-object p3, p0, Ls1/u1;->o:Ls1/u1$h;

    iput-object p3, p0, Ls1/u1;->p:Ls1/u1$i;

    iput-object p4, p0, Ls1/u1;->q:Ls1/u1$g;

    iput-object p5, p0, Ls1/u1;->r:Ls1/z1;

    iput-object p2, p0, Ls1/u1;->s:Ls1/u1$d;

    iput-object p2, p0, Ls1/u1;->t:Ls1/u1$e;

    iput-object p6, p0, Ls1/u1;->u:Ls1/u1$j;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ls1/u1$e;Ls1/u1$i;Ls1/u1$g;Ls1/z1;Ls1/u1$j;Ls1/u1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Ls1/u1;-><init>(Ljava/lang/String;Ls1/u1$e;Ls1/u1$i;Ls1/u1$g;Ls1/z1;Ls1/u1$j;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/u1;
    .locals 0

    invoke-static {p0}, Ls1/u1;->c(Landroid/os/Bundle;)Ls1/u1;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Ls1/u1;
    .locals 8

    const/4 v0, 0x0

    invoke-static {v0}, Ls1/u1;->e(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ls1/u1;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ls1/u1$g;->s:Ls1/u1$g;

    goto :goto_0

    :cond_0
    sget-object v1, Ls1/u1$g;->t:Ls1/h$a;

    invoke-interface {v1, v0}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v0

    check-cast v0, Ls1/u1$g;

    :goto_0
    move-object v5, v0

    const/4 v0, 0x2

    invoke-static {v0}, Ls1/u1;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Ls1/z1;->T:Ls1/z1;

    goto :goto_1

    :cond_1
    sget-object v1, Ls1/z1;->U:Ls1/h$a;

    invoke-interface {v1, v0}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v0

    check-cast v0, Ls1/z1;

    :goto_1
    move-object v6, v0

    const/4 v0, 0x3

    invoke-static {v0}, Ls1/u1;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Ls1/u1$e;->u:Ls1/u1$e;

    goto :goto_2

    :cond_2
    sget-object v1, Ls1/u1$d;->t:Ls1/h$a;

    invoke-interface {v1, v0}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v0

    check-cast v0, Ls1/u1$e;

    :goto_2
    move-object v3, v0

    const/4 v0, 0x4

    invoke-static {v0}, Ls1/u1;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_3

    sget-object p0, Ls1/u1$j;->q:Ls1/u1$j;

    goto :goto_3

    :cond_3
    sget-object v0, Ls1/u1$j;->r:Ls1/h$a;

    invoke-interface {v0, p0}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object p0

    check-cast p0, Ls1/u1$j;

    :goto_3
    move-object v7, p0

    new-instance p0, Ls1/u1;

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ls1/u1;-><init>(Ljava/lang/String;Ls1/u1$e;Ls1/u1$i;Ls1/u1$g;Ls1/z1;Ls1/u1$j;)V

    return-object p0
.end method

.method public static d(Landroid/net/Uri;)Ls1/u1;
    .locals 1

    new-instance v0, Ls1/u1$c;

    invoke-direct {v0}, Ls1/u1$c;-><init>()V

    invoke-virtual {v0, p0}, Ls1/u1$c;->e(Landroid/net/Uri;)Ls1/u1$c;

    move-result-object p0

    invoke-virtual {p0}, Ls1/u1$c;->a()Ls1/u1;

    move-result-object p0

    return-object p0
.end method

.method private static e(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ls1/u1$c;
    .locals 2

    new-instance v0, Ls1/u1$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/u1$c;-><init>(Ls1/u1;Ls1/u1$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls1/u1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls1/u1;

    iget-object v1, p0, Ls1/u1;->n:Ljava/lang/String;

    iget-object v3, p1, Ls1/u1;->n:Ljava/lang/String;

    invoke-static {v1, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls1/u1;->s:Ls1/u1$d;

    iget-object v3, p1, Ls1/u1;->s:Ls1/u1$d;

    invoke-virtual {v1, v3}, Ls1/u1$d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls1/u1;->o:Ls1/u1$h;

    iget-object v3, p1, Ls1/u1;->o:Ls1/u1$h;

    invoke-static {v1, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls1/u1;->q:Ls1/u1$g;

    iget-object v3, p1, Ls1/u1;->q:Ls1/u1$g;

    invoke-static {v1, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls1/u1;->r:Ls1/z1;

    iget-object v3, p1, Ls1/u1;->r:Ls1/z1;

    invoke-static {v1, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls1/u1;->u:Ls1/u1$j;

    iget-object p1, p1, Ls1/u1;->u:Ls1/u1$j;

    invoke-static {v1, p1}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ls1/u1;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/u1;->o:Ls1/u1$h;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ls1/u1$h;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/u1;->q:Ls1/u1$g;

    invoke-virtual {v1}, Ls1/u1$g;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/u1;->s:Ls1/u1$d;

    invoke-virtual {v1}, Ls1/u1$d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/u1;->r:Ls1/z1;

    invoke-virtual {v1}, Ls1/z1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/u1;->u:Ls1/u1$j;

    invoke-virtual {v1}, Ls1/u1$j;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
