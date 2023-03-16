.class public Ly0/d2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/p1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly0/p1<",
        "Ly0/z1;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ly0/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/n<",
            "Ly0/z1;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly0/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/n<",
            "Ly0/z1;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/d2;->a:Ly0/n;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Ly0/z1;
    .locals 1

    :try_start_0
    invoke-static {p1}, Ly0/r0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ly0/d2;->a:Ly0/n;

    invoke-interface {v0, p1}, Ly0/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly0/z1;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic b(Ljava/io/File;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly0/d2;->a(Ljava/io/File;)Ly0/z1;

    move-result-object p1

    return-object p1
.end method
