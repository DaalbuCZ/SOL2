.class public final Lx1/v1$j$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/v1$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Ljava/lang/String;

.field private c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lx1/v1$j$a;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lx1/v1$j$a;->a:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic b(Lx1/v1$j$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lx1/v1$j$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lx1/v1$j$a;)Landroid/os/Bundle;
    .locals 0

    iget-object p0, p0, Lx1/v1$j$a;->c:Landroid/os/Bundle;

    return-object p0
.end method


# virtual methods
.method public d()Lx1/v1$j;
    .locals 2

    new-instance v0, Lx1/v1$j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx1/v1$j;-><init>(Lx1/v1$j$a;Lx1/v1$a;)V

    return-object v0
.end method

.method public e(Landroid/os/Bundle;)Lx1/v1$j$a;
    .locals 0

    iput-object p1, p0, Lx1/v1$j$a;->c:Landroid/os/Bundle;

    return-object p0
.end method

.method public f(Landroid/net/Uri;)Lx1/v1$j$a;
    .locals 0

    iput-object p1, p0, Lx1/v1$j$a;->a:Landroid/net/Uri;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lx1/v1$j$a;
    .locals 0

    iput-object p1, p0, Lx1/v1$j$a;->b:Ljava/lang/String;

    return-object p0
.end method
