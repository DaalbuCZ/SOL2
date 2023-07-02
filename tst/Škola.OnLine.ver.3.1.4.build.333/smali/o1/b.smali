.class public final Lo1/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/b$a;
    }
.end annotation


# static fields
.field private static final b:Lo1/b;


# instance fields
.field private final a:Lo1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/b$a;

    invoke-direct {v0}, Lo1/b$a;-><init>()V

    invoke-virtual {v0}, Lo1/b$a;->a()Lo1/b;

    move-result-object v0

    sput-object v0, Lo1/b;->b:Lo1/b;

    return-void
.end method

.method constructor <init>(Lo1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/b;->a:Lo1/e;

    return-void
.end method

.method public static b()Lo1/b$a;
    .locals 1

    new-instance v0, Lo1/b$a;

    invoke-direct {v0}, Lo1/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lo1/e;
    .locals 1
    .annotation build Lj6/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lo1/b;->a:Lo1/e;

    return-object v0
.end method
