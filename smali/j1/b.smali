.class public final Lj1/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/b$a;
    }
.end annotation


# static fields
.field private static final b:Lj1/b;


# instance fields
.field private final a:Lj1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj1/b$a;

    invoke-direct {v0}, Lj1/b$a;-><init>()V

    invoke-virtual {v0}, Lj1/b$a;->a()Lj1/b;

    move-result-object v0

    sput-object v0, Lj1/b;->b:Lj1/b;

    return-void
.end method

.method constructor <init>(Lj1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/b;->a:Lj1/e;

    return-void
.end method

.method public static b()Lj1/b$a;
    .locals 1

    new-instance v0, Lj1/b$a;

    invoke-direct {v0}, Lj1/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lj1/e;
    .locals 1
    .annotation build Le6/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lj1/b;->a:Lj1/e;

    return-object v0
.end method
