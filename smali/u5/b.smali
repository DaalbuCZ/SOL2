.class public Lu5/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/Map;)Lu5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lu5/a;"
        }
    .end annotation

    new-instance v0, Lu5/a;

    invoke-direct {v0, p1, p2}, Lu5/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method
