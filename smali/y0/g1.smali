.class public Ly0/g1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/p1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly0/p1<",
        "Ly0/k3;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ly0/p;


# direct methods
.method public constructor <init>(Ly0/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/g1;->a:Ly0/p;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Ly0/k3;
    .locals 1

    :try_start_0
    invoke-static {p1}, Ly0/r0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ly0/g1;->a:Ly0/p;

    invoke-virtual {v0, p1}, Ly0/p;->d(Ljava/lang/String;)Ly0/k3;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic b(Ljava/io/File;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly0/g1;->a(Ljava/io/File;)Ly0/k3;

    move-result-object p1

    return-object p1
.end method
