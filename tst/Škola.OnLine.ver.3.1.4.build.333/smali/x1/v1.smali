.class public final Lx1/v1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/v1$j;,
        Lx1/v1$e;,
        Lx1/v1$d;,
        Lx1/v1$k;,
        Lx1/v1$l;,
        Lx1/v1$g;,
        Lx1/v1$i;,
        Lx1/v1$h;,
        Lx1/v1$b;,
        Lx1/v1$f;,
        Lx1/v1$c;
    }
.end annotation


# static fields
.field private static final A:Ljava/lang/String;

.field public static final B:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lx1/v1;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:Lx1/v1;

.field private static final w:Ljava/lang/String;

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/lang/String;

.field private static final z:Ljava/lang/String;


# instance fields
.field public final n:Ljava/lang/String;

.field public final o:Lx1/v1$h;

.field public final p:Lx1/v1$i;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final q:Lx1/v1$g;

.field public final r:Lx1/a2;

.field public final s:Lx1/v1$d;

.field public final t:Lx1/v1$e;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final u:Lx1/v1$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/v1$c;

    invoke-direct {v0}, Lx1/v1$c;-><init>()V

    invoke-virtual {v0}, Lx1/v1$c;->a()Lx1/v1;

    move-result-object v0

    sput-object v0, Lx1/v1;->v:Lx1/v1;

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/v1;->w:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/v1;->x:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/v1;->y:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/v1;->z:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/v1;->A:Ljava/lang/String;

    sget-object v0, Lx1/u1;->a:Lx1/u1;

    sput-object v0, Lx1/v1;->B:Lx1/h$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lx1/v1$e;Lx1/v1$i;Lx1/v1$g;Lx1/a2;Lx1/v1$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/v1;->n:Ljava/lang/String;

    iput-object p3, p0, Lx1/v1;->o:Lx1/v1$h;

    iput-object p3, p0, Lx1/v1;->p:Lx1/v1$i;

    iput-object p4, p0, Lx1/v1;->q:Lx1/v1$g;

    iput-object p5, p0, Lx1/v1;->r:Lx1/a2;

    iput-object p2, p0, Lx1/v1;->s:Lx1/v1$d;

    iput-object p2, p0, Lx1/v1;->t:Lx1/v1$e;

    iput-object p6, p0, Lx1/v1;->u:Lx1/v1$j;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lx1/v1$e;Lx1/v1$i;Lx1/v1$g;Lx1/a2;Lx1/v1$j;Lx1/v1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lx1/v1;-><init>(Ljava/lang/String;Lx1/v1$e;Lx1/v1$i;Lx1/v1$g;Lx1/a2;Lx1/v1$j;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lx1/v1;
    .locals 0

    invoke-static {p0}, Lx1/v1;->c(Landroid/os/Bundle;)Lx1/v1;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Lx1/v1;
    .locals 8

    sget-object v0, Lx1/v1;->w:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    sget-object v0, Lx1/v1;->x:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lx1/v1$g;->s:Lx1/v1$g;

    goto :goto_0

    :cond_0
    sget-object v1, Lx1/v1$g;->y:Lx1/h$a;

    invoke-interface {v1, v0}, Lx1/h$a;->a(Landroid/os/Bundle;)Lx1/h;

    move-result-object v0

    check-cast v0, Lx1/v1$g;

    :goto_0
    move-object v5, v0

    sget-object v0, Lx1/v1;->y:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lx1/a2;->V:Lx1/a2;

    goto :goto_1

    :cond_1
    sget-object v1, Lx1/a2;->D0:Lx1/h$a;

    invoke-interface {v1, v0}, Lx1/h$a;->a(Landroid/os/Bundle;)Lx1/h;

    move-result-object v0

    check-cast v0, Lx1/a2;

    :goto_1
    move-object v6, v0

    sget-object v0, Lx1/v1;->z:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lx1/v1$e;->z:Lx1/v1$e;

    goto :goto_2

    :cond_2
    sget-object v1, Lx1/v1$d;->y:Lx1/h$a;

    invoke-interface {v1, v0}, Lx1/h$a;->a(Landroid/os/Bundle;)Lx1/h;

    move-result-object v0

    check-cast v0, Lx1/v1$e;

    :goto_2
    move-object v3, v0

    sget-object v0, Lx1/v1;->A:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_3

    sget-object p0, Lx1/v1$j;->q:Lx1/v1$j;

    goto :goto_3

    :cond_3
    sget-object v0, Lx1/v1$j;->u:Lx1/h$a;

    invoke-interface {v0, p0}, Lx1/h$a;->a(Landroid/os/Bundle;)Lx1/h;

    move-result-object p0

    check-cast p0, Lx1/v1$j;

    :goto_3
    move-object v7, p0

    new-instance p0, Lx1/v1;

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lx1/v1;-><init>(Ljava/lang/String;Lx1/v1$e;Lx1/v1$i;Lx1/v1$g;Lx1/a2;Lx1/v1$j;)V

    return-object p0
.end method

.method public static d(Landroid/net/Uri;)Lx1/v1;
    .locals 1

    new-instance v0, Lx1/v1$c;

    invoke-direct {v0}, Lx1/v1$c;-><init>()V

    invoke-virtual {v0, p0}, Lx1/v1$c;->e(Landroid/net/Uri;)Lx1/v1$c;

    move-result-object p0

    invoke-virtual {p0}, Lx1/v1$c;->a()Lx1/v1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lx1/v1$c;
    .locals 2

    new-instance v0, Lx1/v1$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx1/v1$c;-><init>(Lx1/v1;Lx1/v1$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx1/v1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx1/v1;

    iget-object v1, p0, Lx1/v1;->n:Ljava/lang/String;

    iget-object v3, p1, Lx1/v1;->n:Ljava/lang/String;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1;->s:Lx1/v1$d;

    iget-object v3, p1, Lx1/v1;->s:Lx1/v1$d;

    invoke-virtual {v1, v3}, Lx1/v1$d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1;->o:Lx1/v1$h;

    iget-object v3, p1, Lx1/v1;->o:Lx1/v1$h;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1;->q:Lx1/v1$g;

    iget-object v3, p1, Lx1/v1;->q:Lx1/v1$g;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1;->r:Lx1/a2;

    iget-object v3, p1, Lx1/v1;->r:Lx1/a2;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1;->u:Lx1/v1$j;

    iget-object p1, p1, Lx1/v1;->u:Lx1/v1$j;

    invoke-static {v1, p1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    iget-object v0, p0, Lx1/v1;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1;->o:Lx1/v1$h;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lx1/v1$h;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1;->q:Lx1/v1$g;

    invoke-virtual {v1}, Lx1/v1$g;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1;->s:Lx1/v1$d;

    invoke-virtual {v1}, Lx1/v1$d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1;->r:Lx1/a2;

    invoke-virtual {v1}, Lx1/a2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1;->u:Lx1/v1$j;

    invoke-virtual {v1}, Lx1/v1$j;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
