.class final Ls1/w0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/e2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Ls1/l3;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ls1/l3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/w0$e;->a:Ljava/lang/Object;

    iput-object p2, p0, Ls1/w0$e;->b:Ls1/l3;

    return-void
.end method

.method static synthetic c(Ls1/w0$e;Ls1/l3;)Ls1/l3;
    .locals 0

    iput-object p1, p0, Ls1/w0$e;->b:Ls1/l3;

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/w0$e;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Ls1/l3;
    .locals 1

    iget-object v0, p0, Ls1/w0$e;->b:Ls1/l3;

    return-object v0
.end method
