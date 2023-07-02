.class public final Lc4/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/a$f;,
        Lc4/a$b;,
        Lc4/a$g;,
        Lc4/a$c;,
        Lc4/a$d;,
        Lc4/a$a;,
        Lc4/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lc4/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lc4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$a<",
            "*TO;>;"
        }
    .end annotation
.end field

.field private final b:Lc4/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$g<",
            "*>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc4/a$a;Lc4/a$g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lc4/a$f;",
            ">(",
            "Ljava/lang/String;",
            "Lc4/a$a<",
            "TC;TO;>;",
            "Lc4/a$g<",
            "TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, Le4/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    invoke-static {p3, v0}, Le4/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc4/a;->c:Ljava/lang/String;

    iput-object p2, p0, Lc4/a;->a:Lc4/a$a;

    iput-object p3, p0, Lc4/a;->b:Lc4/a$g;

    return-void
.end method


# virtual methods
.method public final a()Lc4/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc4/a$a<",
            "*TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lc4/a;->a:Lc4/a$a;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc4/a;->c:Ljava/lang/String;

    return-object v0
.end method
