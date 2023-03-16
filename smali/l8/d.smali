.class public final Ll8/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/d$c;,
        Ll8/d$b;,
        Ll8/d$d;
    }
.end annotation


# instance fields
.field private final a:Ll8/c;

.field private final b:Ljava/lang/String;

.field private final c:Ll8/l;

.field private final d:Ll8/c$c;


# direct methods
.method public constructor <init>(Ll8/c;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ll8/s;->b:Ll8/s;

    invoke-direct {p0, p1, p2, v0}, Ll8/d;-><init>(Ll8/c;Ljava/lang/String;Ll8/l;)V

    return-void
.end method

.method public constructor <init>(Ll8/c;Ljava/lang/String;Ll8/l;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Ll8/d;-><init>(Ll8/c;Ljava/lang/String;Ll8/l;Ll8/c$c;)V

    return-void
.end method

.method public constructor <init>(Ll8/c;Ljava/lang/String;Ll8/l;Ll8/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll8/d;->a:Ll8/c;

    iput-object p2, p0, Ll8/d;->b:Ljava/lang/String;

    iput-object p3, p0, Ll8/d;->c:Ll8/l;

    iput-object p4, p0, Ll8/d;->d:Ll8/c$c;

    return-void
.end method

.method static synthetic a(Ll8/d;)Ll8/l;
    .locals 0

    iget-object p0, p0, Ll8/d;->c:Ll8/l;

    return-object p0
.end method

.method static synthetic b(Ll8/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ll8/d;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Ll8/d;)Ll8/c;
    .locals 0

    iget-object p0, p0, Ll8/d;->a:Ll8/c;

    return-object p0
.end method


# virtual methods
.method public d(Ll8/d$d;)V
    .locals 3

    iget-object v0, p0, Ll8/d;->d:Ll8/c$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll8/d;->a:Ll8/c;

    iget-object v2, p0, Ll8/d;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ll8/d$c;

    invoke-direct {v1, p0, p1}, Ll8/d$c;-><init>(Ll8/d;Ll8/d$d;)V

    :goto_0
    iget-object p1, p0, Ll8/d;->d:Ll8/c$c;

    invoke-interface {v0, v2, v1, p1}, Ll8/c;->c(Ljava/lang/String;Ll8/c$a;Ll8/c$c;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Ll8/d;->a:Ll8/c;

    iget-object v2, p0, Ll8/d;->b:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ll8/d$c;

    invoke-direct {v1, p0, p1}, Ll8/d$c;-><init>(Ll8/d;Ll8/d$d;)V

    :goto_1
    invoke-interface {v0, v2, v1}, Ll8/c;->f(Ljava/lang/String;Ll8/c$a;)V

    :goto_2
    return-void
.end method
