.class final Ls5/a$p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "p"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Ls5/b0$e$d$a$b$e;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ls5/a$p;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;

.field private static final d:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls5/a$p;

    invoke-direct {v0}, Ls5/a$p;-><init>()V

    sput-object v0, Ls5/a$p;->a:Ls5/a$p;

    const-string v0, "name"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$p;->b:Lb6/c;

    const-string v0, "importance"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$p;->c:Lb6/c;

    const-string v0, "frames"

    invoke-static {v0}, Lb6/c;->d(Ljava/lang/String;)Lb6/c;

    move-result-object v0

    sput-object v0, Ls5/a$p;->d:Lb6/c;

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

    check-cast p1, Ls5/b0$e$d$a$b$e;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Ls5/a$p;->b(Ls5/b0$e$d$a$b$e;Lb6/e;)V

    return-void
.end method

.method public b(Ls5/b0$e$d$a$b$e;Lb6/e;)V
    .locals 2

    sget-object v0, Ls5/a$p;->b:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$a$b$e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Ls5/a$p;->c:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$a$b$e;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lb6/e;->c(Lb6/c;I)Lb6/e;

    sget-object v0, Ls5/a$p;->d:Lb6/c;

    invoke-virtual {p1}, Ls5/b0$e$d$a$b$e;->b()Ls5/c0;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
