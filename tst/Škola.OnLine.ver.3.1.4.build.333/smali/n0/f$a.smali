.class public final Ln0/f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls9/g;)V
    .locals 0

    invoke-direct {p0}, Ln0/f$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Ln0/f$a;Ljava/lang/Object;Ljava/lang/String;Ln0/f$b;Ln0/e;ILjava/lang/Object;)Ln0/f;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    sget-object p3, Ln0/c;->a:Ln0/c;

    invoke-virtual {p3}, Ln0/c;->a()Ln0/f$b;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    sget-object p4, Ln0/a;->a:Ln0/a;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Ln0/f$a;->a(Ljava/lang/Object;Ljava/lang/String;Ln0/f$b;Ln0/e;)Ln0/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/String;Ln0/f$b;Ln0/e;)Ln0/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            "Ln0/f$b;",
            "Ln0/e;",
            ")",
            "Ln0/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verificationMode"

    invoke-static {p3, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln0/g;

    invoke-direct {v0, p1, p2, p3, p4}, Ln0/g;-><init>(Ljava/lang/Object;Ljava/lang/String;Ln0/f$b;Ln0/e;)V

    return-object v0
.end method
