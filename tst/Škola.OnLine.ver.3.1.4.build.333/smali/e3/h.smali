.class public interface abstract Le3/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Le3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le3/d;

    invoke-direct {v0}, Le3/d;-><init>()V

    sput-object v0, Le3/h;->a:Le3/h;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/net/Uri;Lx1/n1;Ljava/util/List;Lu3/j0;Ljava/util/Map;Lc2/m;Ly1/t1;)Le3/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lx1/n1;",
            "Ljava/util/List<",
            "Lx1/n1;",
            ">;",
            "Lu3/j0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lc2/m;",
            "Ly1/t1;",
            ")",
            "Le3/j;"
        }
    .end annotation
.end method
