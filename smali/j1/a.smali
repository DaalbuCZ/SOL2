.class public final Lj1/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/a$a;
    }
.end annotation


# static fields
.field private static final e:Lj1/a;


# instance fields
.field private final a:Lj1/f;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj1/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lj1/b;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj1/a$a;

    invoke-direct {v0}, Lj1/a$a;-><init>()V

    invoke-virtual {v0}, Lj1/a$a;->b()Lj1/a;

    move-result-object v0

    sput-object v0, Lj1/a;->e:Lj1/a;

    return-void
.end method

.method constructor <init>(Lj1/f;Ljava/util/List;Lj1/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/f;",
            "Ljava/util/List<",
            "Lj1/d;",
            ">;",
            "Lj1/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/a;->a:Lj1/f;

    iput-object p2, p0, Lj1/a;->b:Ljava/util/List;

    iput-object p3, p0, Lj1/a;->c:Lj1/b;

    iput-object p4, p0, Lj1/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static e()Lj1/a$a;
    .locals 1

    new-instance v0, Lj1/a$a;

    invoke-direct {v0}, Lj1/a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Le6/d;
        tag = 0x4
    .end annotation

    iget-object v0, p0, Lj1/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lj1/b;
    .locals 1
    .annotation build Le6/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lj1/a;->c:Lj1/b;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj1/d;",
            ">;"
        }
    .end annotation

    .annotation build Le6/d;
        tag = 0x2
    .end annotation

    iget-object v0, p0, Lj1/a;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Lj1/f;
    .locals 1
    .annotation build Le6/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lj1/a;->a:Lj1/f;

    return-object v0
.end method

.method public f()[B
    .locals 1

    invoke-static {p0}, Lg1/m;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
