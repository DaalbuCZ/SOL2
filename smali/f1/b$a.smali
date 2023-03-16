.class final Lf1/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Lf1/a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lf1/b$a;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;

.field private static final d:Lb6/c;

.field private static final e:Lb6/c;

.field private static final f:Lb6/c;

.field private static final g:Lb6/c;

.field private static final h:Lb6/c;

.field private static final i:Lb6/c;

.field private static final j:Lb6/c;

.field private static final k:Lb6/c;

.field private static final l:Lb6/c;

.field private static final m:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf1/b$a;

    invoke-direct {v0}, Lf1/b$a;-><init>()V

    sput-object v0, Lf1/b$a;->a:Lf1/b$a;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->b:Lb6/c;

    const-string v0, "model"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->c:Lb6/c;

    const-string v0, "hardware"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->d:Lb6/c;

    const-string v0, "device"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->e:Lb6/c;

    const-string v0, "product"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->f:Lb6/c;

    const-string v0, "osBuild"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->g:Lb6/c;

    const-string v0, "manufacturer"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->h:Lb6/c;

    const-string v0, "fingerprint"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->i:Lb6/c;

    const-string v0, "locale"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->j:Lb6/c;

    const-string v0, "country"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->k:Lb6/c;

    const-string v0, "mccMnc"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->l:Lb6/c;

    const-string v0, "applicationBuild"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Lf1/b$a;->m:Lb6/c;

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

    check-cast p1, Lf1/a;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Lf1/b$a;->b(Lf1/a;Lb6/e;)V

    return-void
.end method

.method public b(Lf1/a;Lb6/e;)V
    .locals 2

    sget-object v0, Lf1/b$a;->b:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->c:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->d:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->e:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->f:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->g:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->h:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->i:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->j:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->k:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->l:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lf1/b$a;->m:Lb6/c;

    invoke-virtual {p1}, Lf1/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
