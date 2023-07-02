.class public final Lo1/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/a$a;
    }
.end annotation


# static fields
.field private static final e:Lo1/a;


# instance fields
.field private final a:Lo1/f;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo1/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lo1/b;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/a$a;

    invoke-direct {v0}, Lo1/a$a;-><init>()V

    invoke-virtual {v0}, Lo1/a$a;->b()Lo1/a;

    move-result-object v0

    sput-object v0, Lo1/a;->e:Lo1/a;

    return-void
.end method

.method constructor <init>(Lo1/f;Ljava/util/List;Lo1/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/f;",
            "Ljava/util/List<",
            "Lo1/d;",
            ">;",
            "Lo1/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/a;->a:Lo1/f;

    iput-object p2, p0, Lo1/a;->b:Ljava/util/List;

    iput-object p3, p0, Lo1/a;->c:Lo1/b;

    iput-object p4, p0, Lo1/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static e()Lo1/a$a;
    .locals 1

    new-instance v0, Lo1/a$a;

    invoke-direct {v0}, Lo1/a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lj6/d;
        tag = 0x4
    .end annotation

    iget-object v0, p0, Lo1/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lo1/b;
    .locals 1
    .annotation build Lj6/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lo1/a;->c:Lo1/b;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo1/d;",
            ">;"
        }
    .end annotation

    .annotation build Lj6/d;
        tag = 0x2
    .end annotation

    iget-object v0, p0, Lo1/a;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Lo1/f;
    .locals 1
    .annotation build Lj6/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lo1/a;->a:Lo1/f;

    return-object v0
.end method

.method public f()[B
    .locals 1

    invoke-static {p0}, Ll1/m;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
