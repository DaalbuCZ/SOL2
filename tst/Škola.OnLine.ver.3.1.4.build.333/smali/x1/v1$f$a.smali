.class public final Lx1/v1$f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/v1$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Landroid/net/Uri;

.field private c:Lg5/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/r<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private h:[B


# direct methods
.method private constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lg5/r;->j()Lg5/r;

    move-result-object v0

    iput-object v0, p0, Lx1/v1$f$a;->c:Lg5/r;

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v0

    iput-object v0, p0, Lx1/v1$f$a;->g:Lg5/q;

    return-void
.end method

.method synthetic constructor <init>(Lx1/v1$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/v1$f$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lx1/v1$f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lx1/v1$f;->a:Ljava/util/UUID;

    iput-object v0, p0, Lx1/v1$f$a;->a:Ljava/util/UUID;

    iget-object v0, p1, Lx1/v1$f;->c:Landroid/net/Uri;

    iput-object v0, p0, Lx1/v1$f$a;->b:Landroid/net/Uri;

    iget-object v0, p1, Lx1/v1$f;->e:Lg5/r;

    iput-object v0, p0, Lx1/v1$f$a;->c:Lg5/r;

    iget-boolean v0, p1, Lx1/v1$f;->f:Z

    iput-boolean v0, p0, Lx1/v1$f$a;->d:Z

    iget-boolean v0, p1, Lx1/v1$f;->g:Z

    iput-boolean v0, p0, Lx1/v1$f$a;->e:Z

    iget-boolean v0, p1, Lx1/v1$f;->h:Z

    iput-boolean v0, p0, Lx1/v1$f$a;->f:Z

    iget-object v0, p1, Lx1/v1$f;->j:Lg5/q;

    iput-object v0, p0, Lx1/v1$f$a;->g:Lg5/q;

    invoke-static {p1}, Lx1/v1$f;->a(Lx1/v1$f;)[B

    move-result-object p1

    iput-object p1, p0, Lx1/v1$f$a;->h:[B

    return-void
.end method

.method synthetic constructor <init>(Lx1/v1$f;Lx1/v1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/v1$f$a;-><init>(Lx1/v1$f;)V

    return-void
.end method

.method static synthetic a(Lx1/v1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Lx1/v1$f$a;->d:Z

    return p0
.end method

.method static synthetic b(Lx1/v1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Lx1/v1$f$a;->e:Z

    return p0
.end method

.method static synthetic c(Lx1/v1$f$a;)Lg5/q;
    .locals 0

    iget-object p0, p0, Lx1/v1$f$a;->g:Lg5/q;

    return-object p0
.end method

.method static synthetic d(Lx1/v1$f$a;)[B
    .locals 0

    iget-object p0, p0, Lx1/v1$f$a;->h:[B

    return-object p0
.end method

.method static synthetic e(Lx1/v1$f$a;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lx1/v1$f$a;->b:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic f(Lx1/v1$f$a;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lx1/v1$f$a;->a:Ljava/util/UUID;

    return-object p0
.end method

.method static synthetic g(Lx1/v1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Lx1/v1$f$a;->f:Z

    return p0
.end method

.method static synthetic h(Lx1/v1$f$a;)Lg5/r;
    .locals 0

    iget-object p0, p0, Lx1/v1$f$a;->c:Lg5/r;

    return-object p0
.end method


# virtual methods
.method public i()Lx1/v1$f;
    .locals 2

    new-instance v0, Lx1/v1$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx1/v1$f;-><init>(Lx1/v1$f$a;Lx1/v1$a;)V

    return-object v0
.end method
