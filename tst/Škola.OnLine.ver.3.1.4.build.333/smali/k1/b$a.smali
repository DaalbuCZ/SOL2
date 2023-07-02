.class final Lk1/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lk1/a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lk1/b$a;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;

.field private static final d:Lg6/c;

.field private static final e:Lg6/c;

.field private static final f:Lg6/c;

.field private static final g:Lg6/c;

.field private static final h:Lg6/c;

.field private static final i:Lg6/c;

.field private static final j:Lg6/c;

.field private static final k:Lg6/c;

.field private static final l:Lg6/c;

.field private static final m:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/b$a;

    invoke-direct {v0}, Lk1/b$a;-><init>()V

    sput-object v0, Lk1/b$a;->a:Lk1/b$a;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->b:Lg6/c;

    const-string v0, "model"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->c:Lg6/c;

    const-string v0, "hardware"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->d:Lg6/c;

    const-string v0, "device"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->e:Lg6/c;

    const-string v0, "product"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->f:Lg6/c;

    const-string v0, "osBuild"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->g:Lg6/c;

    const-string v0, "manufacturer"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->h:Lg6/c;

    const-string v0, "fingerprint"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->i:Lg6/c;

    const-string v0, "locale"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->j:Lg6/c;

    const-string v0, "country"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->k:Lg6/c;

    const-string v0, "mccMnc"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->l:Lg6/c;

    const-string v0, "applicationBuild"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$a;->m:Lg6/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lk1/a;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lk1/b$a;->b(Lk1/a;Lg6/e;)V

    return-void
.end method

.method public b(Lk1/a;Lg6/e;)V
    .locals 2

    sget-object v0, Lk1/b$a;->b:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->c:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->d:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->e:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->f:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->g:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->h:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->i:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->j:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->k:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->l:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Lk1/b$a;->m:Lg6/c;

    invoke-virtual {p1}, Lk1/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
