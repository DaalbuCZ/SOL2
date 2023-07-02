.class public final Lx1/v1$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/v1$j$a;
    }
.end annotation


# static fields
.field public static final q:Lx1/v1$j;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field public static final u:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lx1/v1$j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Landroid/net/Uri;

.field public final o:Ljava/lang/String;

.field public final p:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/v1$j$a;

    invoke-direct {v0}, Lx1/v1$j$a;-><init>()V

    invoke-virtual {v0}, Lx1/v1$j$a;->d()Lx1/v1$j;

    move-result-object v0

    sput-object v0, Lx1/v1$j;->q:Lx1/v1$j;

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/v1$j;->r:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/v1$j;->s:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/v1$j;->t:Ljava/lang/String;

    sget-object v0, Lx1/y1;->a:Lx1/y1;

    sput-object v0, Lx1/v1$j;->u:Lx1/h$a;

    return-void
.end method

.method private constructor <init>(Lx1/v1$j$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lx1/v1$j$a;->a(Lx1/v1$j$a;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lx1/v1$j;->n:Landroid/net/Uri;

    invoke-static {p1}, Lx1/v1$j$a;->b(Lx1/v1$j$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lx1/v1$j;->o:Ljava/lang/String;

    invoke-static {p1}, Lx1/v1$j$a;->c(Lx1/v1$j$a;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Lx1/v1$j;->p:Landroid/os/Bundle;

    return-void
.end method

.method synthetic constructor <init>(Lx1/v1$j$a;Lx1/v1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/v1$j;-><init>(Lx1/v1$j$a;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lx1/v1$j;
    .locals 0

    invoke-static {p0}, Lx1/v1$j;->b(Landroid/os/Bundle;)Lx1/v1$j;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Landroid/os/Bundle;)Lx1/v1$j;
    .locals 2

    new-instance v0, Lx1/v1$j$a;

    invoke-direct {v0}, Lx1/v1$j$a;-><init>()V

    sget-object v1, Lx1/v1$j;->r:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lx1/v1$j$a;->f(Landroid/net/Uri;)Lx1/v1$j$a;

    move-result-object v0

    sget-object v1, Lx1/v1$j;->s:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/v1$j$a;->g(Ljava/lang/String;)Lx1/v1$j$a;

    move-result-object v0

    sget-object v1, Lx1/v1$j;->t:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Lx1/v1$j$a;->e(Landroid/os/Bundle;)Lx1/v1$j$a;

    move-result-object p0

    invoke-virtual {p0}, Lx1/v1$j$a;->d()Lx1/v1$j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx1/v1$j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx1/v1$j;

    iget-object v1, p0, Lx1/v1$j;->n:Landroid/net/Uri;

    iget-object v3, p1, Lx1/v1$j;->n:Landroid/net/Uri;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1$j;->o:Ljava/lang/String;

    iget-object p1, p1, Lx1/v1$j;->o:Ljava/lang/String;

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
    .locals 3

    iget-object v0, p0, Lx1/v1$j;->n:Landroid/net/Uri;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lx1/v1$j;->o:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method
